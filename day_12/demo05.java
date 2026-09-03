package day_12;

public class demo05 {
	public static void main(String[] args) {
		int[] prices = {7, 1, 5, 3, 6, 4};
	    int maxProfit = 0;

	    for (int i = 0; i < prices.length; i++) {
	    	for (int j = i + 1; j < prices.length; j++) {
	    		int profit = prices[j] - prices[i]; // sell - buy
	            if (profit > maxProfit) {
	            	maxProfit = profit;
	                }
	            }
	        }

	        System.out.println("Maximum profit: " + maxProfit);
	    }
	}



