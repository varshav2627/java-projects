package day_7;

public class demo4 {
	static void withdraw(int balance) {
		if (balance <= 0) {
			return;
	        }
	        balance = balance - 2000;
	        System.out.println("Remaining balance: " + balance);
	        withdraw(balance);
	    }

	    public static void main(String[] args) {
	        withdraw(10000);
	    }
	}


