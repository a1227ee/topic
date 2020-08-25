package day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Permutation {
    LinkedList<String> list = new LinkedList<>();
    public String[] permutation(String s) {
        if (s.isEmpty()) return new String[0];
        char[] chars = s.toCharArray();
        dfs(chars,0);

        return list.toArray(new String[list.size()]);
    }
    void dfs(char[] s,int k){
        if (k==s.length-1) {
            list.add(new String(s));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = k; i < s.length; i++) {
            if (set.contains(s[i]))continue;
            set.add(s[i]);
            swap(s,i,k);
            dfs(s,k+1);
            swap(s,i,k);
        }
    }
    void swap(char[] s,int i,int j){
        char temp = s[i];
        s[i]=s[j];
        s[j]=temp;
    }
    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        System.out.println(permutation.permutation("abc").toString());
    }

}
