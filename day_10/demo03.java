package day_10;
import java.util.*;

public class demo03 {
	public static void main(String[]args) {
		int[]numbers= {10,5,20,8,15,30,25};
		int k=3;
		//min heap
		PriorityQueue<Integer> minHeap=new PriorityQueue<>();
		for(int number:numbers) {
			minHeap.add(number);
			//keep only k elements
			if(minHeap.size()>k) {
				minHeap.poll();
			}
		}
		System.out.println("top" + k +"largest numbers:");
		while(!minHeap .isEmpty()) {
			System.out.println(minHeap.poll());
		}
	}

}
