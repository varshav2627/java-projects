package day_8;
import java.util.Stack;

public class demo09 {
	public static void main(String[]args) {
		Stack<Integer>stack=new Stack<>();
		//push elements
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Stack:"+stack);
		//see top elements
		System.out.println("Top elements:"+stack.peek());
		//remove top elements
		System.out.println("removed:"+stack.pop());
		System.out.println("stack after pop:"+stack);
		//check whether stack is empty
		System.out.println("is stack empty ?"+stack.isEmpty());

	}
	
}
