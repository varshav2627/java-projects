package day_8;

public class demo0 {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public static void main(String[]args) {
		Node first=new Node(10);
		Node second=new Node(20);
		Node thrid=new Node(30);
		first.next=second;
		second.next=thrid;
		Node current=first;
		while(current !=null) {
			System.out.println(current.data + "->");
			current=current.next;
		}
	}

}
