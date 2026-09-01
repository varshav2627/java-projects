package day_10;
import java.util.PriorityQueue;
import java.util.Collections;


public class demo06 {
	public static void main(String[] args) {
		
		int[] arr = {10, 5, 20, 8, 15, 3, 25};

	    // Min heap - smallest element on top
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		// Max heap - largest element on top
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		// Add all elements to both heaps
		for (int num : arr) {
			minHeap.add(num);
			maxHeap.add(num);
			}

			// Smallest and largest are just the top of each heap
			System.out.println("Smallest value: " + minHeap.peek());
			System.out.println("Largest value: " + maxHeap.peek());

			// To find the middle value, poll from minHeap until we reach the middle index
			int middleIndex = arr.length / 2; // for odd length, this gives the correct middle
			int middleValue = 0;
			for (int i = 0; i <= middleIndex; i++) {
				middleValue = minHeap.poll();
			}
			System.out.println("Middle value: " + middleValue);
		}
	}


