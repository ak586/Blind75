class Solution{

public void setZeroes(int matrix[][])
	{
		int row=matrix.length;
		int col=matrix[0].length;
		int rowMap[]=new int[row];
		int colMap[]=new int[col];

		for(int i=0; i<row; i++){
		for (int j=0; j<col; j++)
		if(matrix[i][j]==0){
            rowMap[i]=1;
            colMap[j]=1;
        }
		}
		for(int i=0; i<row; i++){
		for(int j=0; j<col; j++)
			if(rowMap[i]+colMap[j]>=1)
				matrix[i][j]=0;
		}

	}

}