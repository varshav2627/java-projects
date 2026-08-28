package day_7;

public class demo8 {
	static int targetNumber = 45;

	static void checkNumber(int number) {
		System.out.println("checking:" + number);
	    if (number == targetNumber) {
	    	System.out.println("Number found:" + number);
	        } else {
	            System.out.println("not a match.");
	        }
	    }

	    public static void main(String[] args) {
	        int[] numbers = {12, 30, 21, 60, 45};

	        for (int num : numbers) {
	           checkNumber(num);
	        }
	    }
	}


