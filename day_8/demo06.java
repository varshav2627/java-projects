//circular queue
package day_8;

public class demo06 {
	static int[] queue = new int[5];
	static int front = 0;
	static int rear = -1;
	static int count = 0; 

	// add element
	static void enqueue(int value) {
		if (count == queue.length) {
			System.out.println("Queue is full");
	      } else {
	    	  rear = (rear + 1) % queue.length; 
	          queue[rear] = value;
	          count++;
	          System.out.println(value + " added");
	        }
	    }

	    // remove element
	    static void dequeue() {
	        if (count == 0) {
	            System.out.println("Queue is empty");
	        } else {
	            System.out.println(queue[front] + " removed");
	            front = (front + 1) % queue.length; 
	            count--;
	        }
	    }

	    // display queue
	    static void display() {
	        if (count == 0) {
	            System.out.println("Queue is empty");
	            return;
	        }
	        System.out.println("Queue elements:");
	        for (int i = 0; i < count; i++) {
	            int index = (front + i) % queue.length;
	            System.out.println(queue[index]);
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        enqueue(10);
	        enqueue(20);
	        enqueue(30);
	        enqueue(40);
	        enqueue(50);
	        display();

	        dequeue();
	        dequeue();
	        dequeue();
	        dequeue();
	        dequeue();
	        display();

	    }
	}


