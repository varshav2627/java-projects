package day_7;

public class demo3 {
	static void count(int n) {
		if(n==0) {
			return;

		}
		System.out.println(n);
		count(n-1);
		
	}
	public static void main(String[]args) {
		System.out.println("arfsc");
		count(5);
		System.out.println("arfsc");

	}

}
