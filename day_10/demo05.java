package day_10;

import java.util.PriorityQueue;
import java.util.Collections;


public class demo05 {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		maxHeap.add(30);
		maxHeap.add(10);
		maxHeap.add(20);
		maxHeap.add(05);

		System.out.println("max heap:" + maxHeap);

		System.out.println("largest element:" + maxHeap.peek());
		}

	}

