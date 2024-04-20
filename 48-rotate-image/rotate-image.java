class Solution {
    
    public void rotate(int[][] matrix) {
        int r=matrix.length; 
        int c=matrix[0].length;
        transpose(matrix, r, c);
        for(int i=0; i<r; i++){
            int left=0;
            int right=c-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
        
        
    }

    private void transpose(int [][]mat, int row, int col){
        for(int i=0; i<row; i++){
            for(int j=0; j<i; j++){
                // swap 
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }


}