package day_8;

public class demo02 {
	static class Node {
		int data;
	    Node next;

	    Node(int data) {
	    	this.data = data;
	        }
	    }

	    static Node head = null;
	    static Node tail = null;

	    static void add(int data) {
	    	Node newNode = new Node(data);

	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	            newNode.next = head;
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	            tail.next = head; 
	        }
	    }

	    
	    static void display() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        Node current = head;
	        do {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        } while (current != head); 

	        System.out.println("(back to head: " + head.data + ")");
	    }

	    public static void main(String[] args) {
	        add(10);
	        add(20);
	        add(30);
	        add(40);

	        System.out.println("Circular Linked List:");
	        display();
	    }
	}


