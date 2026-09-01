package day_9;

public class demo {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	//recursive method
	static void preorder(Node root) {
		//base condition
		if(root==null) {
			return;
		}
		//1.visit root
		System.out.println(root.data + "");
		//2.visit left tree
		preorder(root.left);
		//3.visit right tree
		preorder(root.right);
		
	}
	public static void main(String[]args) {
		//create a tree
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		//start traversal
		preorder(root);


	}
	

}
