package day05;

public class MyPow {
    public double myPow(double x, int n) {
            double res=1;
            for (int i=n;i!=0;i/=2,x*=x){
                if (i%2!=0){
                    res*=x;
                }
            }
            return n>0?res:1/res;
    }
}
