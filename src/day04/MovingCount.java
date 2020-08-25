package day04;

public class MovingCount {
    /**
     *
     * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。
     * 一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），
     * 也不能进入行坐标和列坐标的数位之和大于k的格子。
     * 例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]
     * ，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
     *
     */
    public int movingCount(int m, int n, int k) {
        if (m<0 || n<0 || Sum(m)+Sum(n) > k){
            return 0;
        }
        boolean[][] ints = new boolean[m][n];
        return dfs(0,0,m,n,k,ints);

    }
    int dfs(int i,int j,int m,int n,int k,boolean[][] ints){
        if (i<0 || j<0 || i>=m || j>=n || Sum(i)+Sum(j) > k || ints[i][j]){
            return 0;
        }
        ints[i][j]=true;
        return 1+dfs(i-1,j,m,n,k,ints)+dfs(i,j-1,m,n,k,ints)+
                dfs(i+1,j,m,n,k,ints)+dfs(i,j+1,m,n,k,ints);
    }
    int Sum(int m){
        int sum=0;
        while (m>0){
            sum+=m%10;
            m/=10;
        }
        return sum ;
    }

    public static void main(String[] args) {
        MovingCount movingCount = new MovingCount();
        int i = movingCount.movingCount(3, 2, 17);
        System.out.println(i);
    }
}
