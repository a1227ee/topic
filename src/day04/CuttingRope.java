package day04;

public class CuttingRope {
    public int cuttingRope(int n) {
        if(n==2||n==3){
            return n-1;
        }
        int res=1;
        while (n>4){
            n-=3;
            res*=3;
        }
        return res*n;
    }
    public int cuttingRopeDt(int n) {
        int[] db=new int[n-1];
        db[1]=1;
        for (int i=2;i<=n;i++) {
            for (int j = 1; j < i; j++) {
                db[i] = Math.max(db[i],Math.max(db[j],j)*Math.max(db[i-j],i-j));
            }
        }
        return db[n];
    }
}
