package day18;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GenerateParenthesis
 * @Deacription: 22 括号生成
 * @Author zzx
 * @Date 2020/9/1 14:25
 **/

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        back(n,0,0,ans,new StringBuilder(""));
        return ans;
    }
    public void back(int max,int l,int r,List<String> list,StringBuilder str){
        if ((l+r)==2*max){
            list.add(str.toString());
            return;
        }
        if (l<max){
            str.append("(");
            back(max,l+1,r,list,str);
            str.deleteCharAt(str.length()-1);
        }

        if (r<l){
            str.append(")");
            back(max,l,r+1,list,str);
            str.deleteCharAt(str.length()-1);
        }

    }


    public static void main(String[] args) {
        List<String> strings = new GenerateParenthesis().generateParenthesis(3);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
