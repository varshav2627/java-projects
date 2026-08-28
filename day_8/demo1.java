package day_8;
import java.util.Stack;


public class demo1 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

	    stack.push(5);
	    stack.push(4);

	    int b = stack.pop();
	    int a = stack.pop();

	    int result = a * b;
	    stack.push(result);

	    System.out.println("Result = " + stack.pop());
	    }
	}


