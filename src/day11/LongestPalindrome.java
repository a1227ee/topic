package day11;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if( s.length()<=1){
            return s;
        }
        char[] chars = s.toCharArray();
        int len = s.length();
        boolean[][]  res=new boolean[len][len];
        for (int i=0;i<len;i++){
            res[i][i]=true;
        }
        int bin=0;
        int max=1;
        for (int j=1;j<len;j++){
            for (int i=0;i<j;i++){
                if (chars[i] == chars[j]){
                    if (j-i<3){
                        res[i][j]=true;
                    }else{
                        res[i][j]=res[i+1][j-1];
                    }
                }else{
                    res[i][j]=false;
                }

                if(res[i][j] && j-i+1>max){
                    max=j-i+1;
                    bin=i;
                }
            }
        }
        return s.substring(bin,max+bin);

    }

    public static void main(String[] args) {
        String babad = new LongestPalindrome().longestPalindrome("babad");
        System.out.println(babad);
    }
}
