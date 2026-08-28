package day_4;
import java.util.Scanner;

public class demo0 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a number:");
	        int num = sc.nextInt();

	        int sum = 0;
	        StringBuilder expression = new StringBuilder();

	        for (int i = num; i >= 1; i--) {
	            sum += i;
	            expression.append(i);
	            if (i != 1) {
	                expression.append(" + ");
	            }
	        }

	        System.out.println(expression + " = " + sum);

	        sc.close();
	    }
	}
	
	
	
	


