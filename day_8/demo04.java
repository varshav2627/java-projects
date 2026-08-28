//merged linked list
package day_8;

public class demo04 {
	static class Node {
		int data;
	    Node next;
	    Node(int data) {
	    	this.data = data;
	        }
	    }

	    public static void main(String[] args) {
	        // list 1: 150 -> 250 -> 350
	        Node head1 = new Node(150);
	        head1.next = new Node(250);
	        head1.next.next = new Node(350);

	        // list 2: 450 -> 550 -> 650
	        Node head2 = new Node(450);
	        head2.next = new Node(550);
	        head2.next.next = new Node(650);

	        System.out.println("List 1:");
	        print(head1);

	        System.out.println("List 2:");
	        print(head2);

	        Node mergedHead = merge(head1, head2);

	        System.out.println("Merged list:");
	        print(mergedHead);
	    }

	    // merge  list2 at the end of list1
	    static Node merge(Node head1, Node head2) {
	        if (head1 == null) {
	            return head2;
	        }

	        Node current = head1;
	        while (current.next != null) {
	            current = current.next; 
	        }

	        current.next = head2; 
	        return head1;
	    }

	    // print the list
	    static void print(Node head) {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
	}


