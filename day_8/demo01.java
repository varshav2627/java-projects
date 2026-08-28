package day_8;

public class demo01 {
	static class Node{
		int data;
		Node previous;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public static void main(String[]args) {
		Node first=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		first.next=second;
		second.next=third;
		second.previous=second;
		third.previous=second;
		Node current=first;
		System.out.println("forwad:");
		while(current !=null) {
			System.out.println(current.data + "");
			current=current.next;
		}
		current=third;
		System.out.println("\n backward:");
		while(current !=null) {
			System.out.println(current.data + "");
			current=current.previous;
		}
	}

}
