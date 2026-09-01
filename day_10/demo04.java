package day_10;
import java.util.PriorityQueue;

public class demo04 {
	public static void main(String[]args) {
		
		PriorityQueue<Integer>minHeap=new PriorityQueue<>();
		minHeap.add(30);
		minHeap.add(10);
		minHeap.add(20);
		minHeap.add(05);


		System.out.println("min heap:"+minHeap);
		
		System.out.println("smallest elements:"+minHeap.peek());
	}

}
