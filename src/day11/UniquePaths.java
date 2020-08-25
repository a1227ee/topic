package day11;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] res=new int[m][n];

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (i==0&&j==0){
                    res[i][j]=1;
                }
                if (i!=0&&j==0){
                    res[i][j]=res[i-1][j];
                }
                if (i==0&&j!=0){
                    res[i][j]=res[i][j-1];
                }
                if (i!=0 && j!=0){
                    res[i][j]=res[i][j-1]+res[i-1][j];
                }

            }
        }
        return res[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(new UniquePaths().uniquePaths(7, 3));
    }
}
