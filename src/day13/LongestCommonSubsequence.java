package day13;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * leetcode 1143.最长公共子序列
 */
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int[][] res = new int[n+1][m+1];
        for (int i=0;i<n+1;i++){
            res[i][0]=0;
        }
        for (int i=0;i<m+1;i++){
            res[0][m]=0;
        }


        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){

                if (text1.charAt(i)==text2.charAt(j)){
                    res[i+1][j+1]=res[i][j]+1;
                }else{
                    res[i+1][j+1]=Math.max(res[i+1][j],res[i][j+1]);
                }

            }
        }
        return res[n][m];

    }

    public static void main(String[] args) {
        int i = new LongestCommonSubsequence().longestCommonSubsequence("abcde", "ace");
        System.out.println(i);
    }
}
