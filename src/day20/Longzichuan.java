package day20;

/**
 * @ClassName Longzichuan
 * @Deacription: 最长字串  00000
 *                        01000
 *                        00200
 *                        00030
 * @Author zzx
 * @Date 2020/9/4 14:27
 **/

public class Longzichuan {
    public static void main(String[] args) {
        String s = maxString("aabccsadadaddd", "asdaabccsasssddsjkjl");
        System.out.println(s);
    }

    public static String maxString(String s1,String s2){
        if (s1 ==null ||s2 ==null){
            return "";
        }
        ThreadLocal<Object> local = new ThreadLocal<>();


        int len1 = s1.length();
        int len2 = s2.length();

        int[][] res=new int[len1+1][len2+1];

        for (int i=0;i<len1;i++){
            res[i][0]=0;
        }
        for (int j=0;j<len2;j++){
            res[0][j]=0;
        }
        int cur=0;
        int max=0;
        for (int i=0;i<len1;i++){
            for (int j=0;j<len2;j++){
                if (s1.charAt(i)==s2.charAt(j)){
                    res[i+1][j+1]=res[i][j]+1;
                    if (res[i+1][j+1]>max){
                        max=res[i+1][j+1];
                        cur=i;
                    }
                }else {
                    res[i+1][j+1]=0;
                }
            }
        }

        return s1.substring(cur-max+1,cur+1);
    }
}
