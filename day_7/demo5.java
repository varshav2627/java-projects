package day_7;

public class demo5 {
	public static void main(String[] args) {
		int balance = 10000;

	    for (int i = 1; balance > 0; i++) {
	    	balance = balance - 2000;
	        System.out.println("Withdrawal " + i + ": Remaining balance: " + balance);
	        }
	    }
	}


