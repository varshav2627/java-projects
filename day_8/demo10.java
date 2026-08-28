package day_8;
import java.util.Stack;

public class demo10 {
	public static void main(String[]args) {
		Stack<Integer>stack=new Stack<>();
		stack.push(2);
		stack.push(3);
		int b=stack.pop();
		int a=stack.pop();
		stack.push(a+b);//2+3=5
		
		stack.push(4);
		b=stack.pop();
		System.out.println("results="+b);
		a=stack.pop();
		System.out.println("results="+a);
		stack.push(a*b);//5*4=20
		System.out.println("results="+a*b);
	}

}
