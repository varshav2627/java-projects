package day_6;

import java.util.HashSet;
import java.util.Set;

public class demo9 {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
	    int[] arr2 = {4, 5, 6, 7, 8};

	    Set<Integer> unionSet = new HashSet<>();

	    // Add all elements from both arrays; HashSet automatically removes duplicates
	    for (int num : arr1) {
	    	unionSet.add(num);
	        }
	        for (int num : arr2) {
	        	unionSet.add(num);
	        }

	        System.out.println("Union of the two arrays:");
	        for (int num : unionSet) {
	            System.out.print(num + " ");
	        }
	    }
	}


