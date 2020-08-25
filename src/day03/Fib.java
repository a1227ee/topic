package day03;

public class Fib {
    int constant = 1000000007;
    public int fib(int n) {
        if (n<2)
            return n;
        int first=0;
        int second=1;
        while (n-->0){
            int sum=first+second;
            first=second% constant;
            second=sum% constant;
        }
        return first;

    }

    public static void main(String[] args) {
        Fib fib = new Fib();
        System.out.println(fib.fib(5));
    }
}
