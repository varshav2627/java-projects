package day_12;

public class demo06 {
	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 3, 12};
	    int[] result = new int[nums.length];
	    int index = 0;

	    // Step 1: copy non-zero numbers first
	    for (int i = 0; i < nums.length; i++) {
	    	if (nums[i] != 0) {
	    		result[index] = nums[i];
	            index++;
	            }
	        }

	        // Step 2: remaining spots are already 0 by default

	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	    }
	}


