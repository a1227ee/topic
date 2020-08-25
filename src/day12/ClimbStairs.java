package day12;

public class ClimbStairs {
    public int climbStairs(int n) {
        int[] db = new int[n];
        db[0]=1;
        db[1]=2;
        for (int i=2;i<n;i++){
            db[i]=db[i-1]+db[i-2];
        }
        return db[n-1];
    }
}
