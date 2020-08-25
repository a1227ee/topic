package day13;

/**
 * 1277. 统计全为 1 的正方形子矩阵
 */
public class CountSquares {
    public int countSquares(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int min=Math.min(n,m);
        boolean[][][] dp = new boolean[n][m][min];
        int res=0;
        for (int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                if (matrix[i][j]==1){
                    dp[i][j][0]=true;
                    res++;
                }else{
                    dp[i][j][0]=false;
                }
            }
        }

        for (int i=1;i<n;i++){
            for (int j=1;j<m;j++){
                for (int k=1;k<min;k++){
                    dp[i][j][k]=(dp[i][j][k-1] && dp[i-1][j][k-1] &&dp[i][j-1][k-1] &&dp[i-1][j-1][k-1]);
                    if (dp[i][j][k]){
                        res++;
                    }
                }
            }
        }
        return res;

    }
}
