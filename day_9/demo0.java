package day_9;

public class demo0 {
	static class Node{
		int data;
	    Node left;
	    Node right;
		Node(int data){
			this.data=data;
			}
		}
		//recursive method
		static void postorder(Node root) {
			//base condition
			if(root==null) {
				return;
			}
			//1.visit left tree
			postorder(root.left);
			//2.visit right tree
			postorder(root.right);
			//3.visit root
			System.out.println(root.data + "");

		}
		public static void main(String[]args) {
			//create a tree
			Node root=new Node(1);
			root.left=new Node(2);
			root.right=new Node(3);
			root.left.left=new Node(4);
			root.left.right=new Node(5);
			//start traversal
			postorder(root);


		}


	}


