package day_10;

import java.util.PriorityQueue;

public class demo07 {
	public static void main(String[] args) {
		
		int[] arr = {30, 10, 20, 5, 25};
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int num : arr) {
			minHeap.add(num);
			}

			System.out.println("min heap:" + minHeap);

			// Poll elements one by one until we reach the middle position
			int middleIndex = arr.length / 2;
			int middleValue = 0;

			for (int i = 0; i <= middleIndex; i++) {
				middleValue = minHeap.poll();
			}

			System.out.println("middle value:" + middleValue);
		}
	}
