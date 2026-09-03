package day_12;
import java.util.HashSet;

public class demmo04 {
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> seen = new HashSet<>();

	    for (int num : nums) {
	    	if (seen.contains(num)) {
	    		return true; // duplicate found
	            }
	            seen.add(num);
	        }

	        return false; // no duplicates
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 1};

	        if (containsDuplicate(nums))
	            System.out.println("Array contains duplicates");
	        else
	            System.out.println("Array has no duplicates");
	    }
	}


