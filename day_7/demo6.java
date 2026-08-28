package day_7;

public class demo6 {
	public static void main(String[] args) {
		int balance = 10000;
	    int i = 1;

	    while (balance > 0) {
	    	balance = balance - 2000;
	        System.out.println("Withdrawal " + i + ": Remaining balance: " + balance);
	        i++;
	        }
	    }
	}


