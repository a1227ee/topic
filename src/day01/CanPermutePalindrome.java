package day01;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.HashMap;
import java.util.Map;

public class CanPermutePalindrome {
    int ss=0;
    public boolean canPermutePalindrome(String s) {
        if (s.isEmpty()){
            return true;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] chars = s.toCharArray();
        for (char achar : chars) {
            if (map.containsKey(achar)){
                map.put(achar,map.get(achar)+1);
            }else {
                map.put(achar,1);
            }
        }
        int ji=0;
        map.forEach((k,v)->{

        });
        for (Integer value : map.values()) {
            if (value%2!=0){
                ji++;
            }
            if (ji>1){
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {
        System.out.println((int)'A');
    }
}
