class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int dp[][]= new int[m][n];
        for(int j=0; j<n; j++) dp[0][j]=matrix[0][j];

        for(int i=1; i<m; i++){
            for(int j=0; j<n; j++){
                int ans=Integer.MAX_VALUE;
                if(j<m-1)
                ans=Math.min(dp[i-1][j+1], ans);
                if(j>0) ans=Math.min(dp[i-1][j-1], ans);
                ans=Math.min(ans, dp[i-1][j]);
                dp[i][j]=ans+matrix[i][j];
            }
        }
        return Arrays.stream(dp[m-1]).min().getAsInt();
       
    }
}