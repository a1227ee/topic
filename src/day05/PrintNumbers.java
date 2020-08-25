package day05;

import java.util.Arrays;

public class PrintNumbers {
    public int[] printNumbers(int n) {
        int p=10;
        while (--n>0){
            p*=10;
        }
        int[] ints = new int[p-1];
        for (int i=1;i<p;i++){
            ints[i-1]=i;
        }
        return ints;
    }

    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();
        int[] ints = printNumbers.printNumbers(1);
        String s = Arrays.toString(ints);
        System.out.println(s);
    }
}
