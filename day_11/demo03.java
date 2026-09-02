//Grid->it is a collection of rows and columns and arranged as the table.
//finding the numbers of paths in the grid.
package day_11;

public class demo03 {

	public static void main(String[]args) {
		int rows=3;
		int cols=3;
		int[][]dp=new int[rows][cols];
		//first row=1 way
		for(int j=0;j<cols;j++) {
			dp[0][j]=1;
		}
		//first column=1 way
		for(int i=0;i<rows;i++) {
			dp[i][0]=1;
		}
		//fill remaining cells
		for(int i=1;i<rows;i++) {
			for(int j=1;j<cols;j++) { 
				dp[i][j]=dp[i-1][j]+dp[i][j-1];
			}
		}
		System.out.println("number of paths="+dp[rows-1][cols-1]);
	}


}
