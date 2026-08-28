package day_6;

import java.util.HashSet;
import java.util.Set;

public class demo11 {
	public static void main(String[] args) {
		int[] array1 = {10, 20, 30};
	    int[] array2 = {30, 40, 50, 60};

	    Set<Integer> set1 = new HashSet<>();
	    Set<Integer> set2 = new HashSet<>();

	    for (int num : array1) set1.add(num);
	    for (int num : array2) set2.add(num);

	        
	    Set<Integer> common = new HashSet<>(set1);
	    common.retainAll(set2);

	        
	    set1.removeAll(common);
	    set2.removeAll(common);

	        
	    set1.addAll(set2);

	    System.out.println("Numbers after removing common ones:");
	    for (int num : set1) {
	    	System.out.print(num + " ");
	        }
	    }
	}


