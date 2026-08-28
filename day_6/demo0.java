package day_6;

import java.util.HashSet;
import java.util.Set;

public class demo0 {
	public static void main(String[] args) {
		String[] arr1 = {"Alice", "Bob", "Charlie", "David"};
		String[] arr2 = {"Charlie", "David", "Emma", "Frank"};

	    Set<String> set1 = new HashSet<>();
	    Set<String> set2 = new HashSet<>();

	        
	    for (String name : arr1) {
	    	set1.add(name);
	        }
	        for (String name : arr2) {
	        	set2.add(name);
	        }

	        
	        Set<String> common = new HashSet<>(set1);
	        common.retainAll(set2);

	        
	        set1.removeAll(common);
	        set2.removeAll(common);

	       
	        Set<String> result = new HashSet<>();
	        result.addAll(set1);
	        result.addAll(set2);

	        System.out.println("Names after removing common ones:");
	        for (String name : result) {
	            System.out.print(name + " ");
	        }
	    }
	}


