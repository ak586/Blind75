class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                boolean visited[][]=new boolean[board.length][board[0].length];
                if(board[i][j]==word.charAt(0) &&helper(i,j,board,"",word, visited)) return true;
            }
        }
        return false;
    }
    private boolean helper(int i, int j, char [][]board, String curr , String word, boolean visited[][]){
        if(word.equals(curr)) return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || visited[i][j]) return false;
        if(board[i][j]!=word.charAt(curr.length())) return false;
        visited[i][j]=true;
        boolean ans=helper(i+1, j, board, curr+board[i][j], word, visited)
        ||helper(i, j+1, board, curr+board[i][j], word, visited)
        ||helper(i, j-1, board, curr+board[i][j], word, visited)
        ||helper(i-1, j, board, curr+board[i][j], word, visited);
    
        visited[i][j]=false; 
        return ans;
        
    }
}