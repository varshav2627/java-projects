package day_11;

public class demo04 {
	public static void main(String[] args) {
		int[][] grid = {
				{1, 3, 1},
	            {1, 5, 1},
	            {4, 2, 1}
	        };

	        int rows = grid.length;
	        int cols = grid[0].length;
	        int[][] dp = new int[rows][cols];

	        // first cell = itself
	        dp[0][0] = grid[0][0];

	        // first row = cumulative sum (can only come from left)
	        for (int j = 1; j < cols; j++) {
	            dp[0][j] = dp[0][j - 1] + grid[0][j];
	        }

	        // first column = cumulative sum (can only come from top)
	        for (int i = 1; i < rows; i++) {
	            dp[i][0] = dp[i - 1][0] + grid[i][0];
	        }

	        // fill remaining cells
	        for (int i = 1; i < rows; i++) {
	            for (int j = 1; j < cols; j++) {
	                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
	            }
	        }

	        System.out.println("Minimum Path Sum = " + dp[rows - 1][cols - 1]);
	    }
	}


