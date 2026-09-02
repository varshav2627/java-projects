package day_11;

public class demo06 {
	public static void main(String[] args) {
		
		int n = 10; // number of terms
	    int[] dp = new int[n];

	    dp[0] = 0; // first term
	    dp[1] = 1; // second term

	    for (int i = 2; i < n; i++) {
	    	dp[i] = dp[i - 1] + dp[i - 2];
	        }

	        System.out.print("Fibonacci Series = ");
	        for (int i = 0; i < n; i++) {
	        	System.out.print(dp[i] + " ");
	        }
	    }
	}


