//queue
package day_8;

public class demo05 {
	static int[]queue=new int[5];
	static int front=0;
	static int rear=-1;
	//add elements
	static void enqueue(int values) {
		if(rear==queue.length - 1) {
			System.out.println("queue is full");
		}else {
			rear++;
			queue[rear]=values;
			System.out.println(values + "added" );
		}
	}
	//remove elements
	static void dequeue() {
		if(front>rear) {
			System.out.println("queue is empty");
		}else {
			System.out.println(queue[front] + "remove");
			front++;
		}
	}
	//display queue
	static void display() {
		System.out.println("queue available elements");
		for(int i= front;i<=rear;i++) {
			System.out.println(queue[i]+"");
		}
		System.out.println();
	}
	public static void main(String[]args) {
		enqueue(10);
		enqueue(20);
		enqueue(30);
		enqueue(40);
		enqueue(50);
		display();
		dequeue();
		dequeue();
		dequeue();
		display();




	}

}
