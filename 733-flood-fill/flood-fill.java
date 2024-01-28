class Solution {
    public void helper(int image[][], int i, int j, int color, int s_color, int visited[][]){
        if(i>=image.length || j>=image[0].length  ||i<0 || j<0) return ;
        if(visited[i][j]==0 &&image[i][j]==s_color)
        {
            image[i][j]=color;
            visited[i][j]=1;
            helper(image, i+1, j, color, s_color, visited);
            helper(image, i-1, j, color, s_color, visited);
            helper(image, i, j+1, color, s_color, visited);
            helper(image, i, j-1, color, s_color, visited);
        }
        else return ;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       int  m=image.length;
       int n=image[0].length;
        int s_color=image[sr][sc];
        int visited[][]=new int [m][n];
       helper(image, sr, sc, color, s_color, visited);
        return image;
    }
}