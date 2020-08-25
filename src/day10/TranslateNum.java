package day10;

public class TranslateNum {
    public int translateNum(int num) {
        String s = String.valueOf(num);


        int[] res = new int[s.length()];
        char[] chars = s.toCharArray();
        res[0]=1;
        for (int i = 1; i < chars.length; i++) {
            int sum=10*(chars[i-1]-'0')+(chars[i]-'0');
            if (sum>9 && sum<26){
                if (i-2<0) res[i-1]++;
                else res[i]=res[i-1]+res[i-2];
            }else{
                res[i]=res[i-1];
            }
        }

        return res[chars.length];


    }

    public static void main(String[] args) {
        int sum=10*('6'-'0')+('7'-'0');
        System.out.println(sum);
    }
}
