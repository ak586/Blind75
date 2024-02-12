class Solution {
public:
    void handleRows(vector<vector<int>>&grid){
        int m=grid.size();
        for(int i=0; i<m; i++){
            if(grid[i][0]==0){
                for(auto &x: grid[i])
                    x^=1;
            }
        }
    
    }

    void invertCol(vector<vector<int>>&grid, int j){
        int m=grid.size();
        for(int i=0; i<m; i++){
            grid[i][j]=(grid[i][j]==0)?1:0;
        }
    }


    void handleCols(vector<vector<int>>&grid){
        int m=grid.size();
        int n=grid[0].size();
        for(int j=1; j<n; j++){
            int count0=0;
            int count1=0;
            for (int i=0; i<m; i++){
                if(grid[i][j]==0) count0++;
                else count1++;
            }
            if(count0>count1)
                invertCol(grid, j);
        }
    }

    int convertRowToNumber(vector<int>arr){
        int pow=1;
        int ans=0;
        for (int i=arr.size()-1; i>=0; i--){
            ans+=arr[i]*pow;
            pow<<=1;
        }
        return ans;
    }


    int matrixScore(vector<vector<int>>& grid) {
        handleRows(grid);
        handleCols(grid);

    int ans=0;
        for(auto row: grid){
            // cout<<convertRowToNumber(row);
            ans+=convertRowToNumber(row);  
        }
        return ans;
    }
};