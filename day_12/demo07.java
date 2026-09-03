package day_12;
import java.util.Arrays;


public class demo07 {
	public static void main(String[] args) {
		int[] list1 = {1, 2, 4};
	    int[] list2 = {1, 3, 4};

	    int[] merged = new int[list1.length + list2.length];
	    int index = 0;

	    // copy list1 into merged
	    for (int num : list1) {
	    	merged[index] = num;
	        index++;
	        }

	        // copy list2 into merged
	        for (int num : list2) {
	            merged[index] = num;
	            index++;
	        }

	        // sort the combined array
	        Arrays.sort(merged);

	        // print result
	        for (int num : merged) {
	            System.out.print(num + " ");
	        }
	    }
	}


