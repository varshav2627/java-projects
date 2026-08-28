package day_7;

public class demo7 {
	static String correctPassword="568";
	static void tryPassword(String password) {
		System.out.println("trying:"+password);
		
		if(password.equals(correctPassword)) {
			System.out.println("Password found:"+password);
			return;
		}
		System.out.println("wrong password.go back and try another.");
		
	}
	public static void main(String[]args) {
		tryPassword("668");
		tryPassword("658");
		tryPassword("886");
		tryPassword("658");
		tryPassword("568");	
	}

		}


