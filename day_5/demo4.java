package day_5;

public class demo4 {
	public static void main(String[] args) {
        int n = 122, rev = 0, temp = n;
        while(n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(temp == rev ? "Palindrome" : "Not Palindrome");
    }

}
