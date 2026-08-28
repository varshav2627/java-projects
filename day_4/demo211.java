package day_4;

public class demo211 {  

	    public static void main(String[] args) {
	        int[] units = {10, 15, 12, 20, 18, 14, 16};
	        int total = 0;

	        System.out.println("Daily Electricity Consumption:");
	        for (int i = 0; i < units.length; i++) {
	            System.out.println("Day " + (i + 1) + ": " + units[i] + " units");
	            total += units[i];
	        }

	        System.out.println("Total Consumption for 7 days: " + total + " units");
	    }
	}


