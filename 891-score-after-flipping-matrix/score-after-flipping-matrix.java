class Solution {
    public int matrixScore(int[][] grid) {
        int row=grid.length;
       int col=grid[0].length;
       int ans=row*(1<<(col-1));

       for (int j=1; j<col; j++){
           int count1=0;
           for(int i=0; i<row; i++){
               if(grid[i][0]==grid[i][j])
               count1++;
           }
           int count0=row-count1;
           count1=Math.max(count1, count0);
           ans+=count1*(1<<(col-j-1));
       }
       return ans;
    }
}