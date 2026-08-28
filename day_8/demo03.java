package day_8;

public class demo03 {
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
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	        }
	    }

	    static void reverse() {
	        Node previous = null;
	        Node current = head;
	        Node nextNode;

	        tail = head; 

	        while (current != null) {
	            nextNode = current.next;  
	            current.next = previous;  
	            previous = current;       
	            current = nextNode;       
	        }

	        head = previous; 
	    }

	    static void display() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }

	    public static void main(String[] args) {
	        add(10);
	        add(20);
	        add(30);
	        add(40);

	        System.out.println("Original list:");
	        display();

	        reverse();

	        System.out.println("Reversed list:");
	        display();
	    }
	}


