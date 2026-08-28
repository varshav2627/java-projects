package day_7;

public class demo01 {
	public static void main(String[] args) {
		String[] arr = {"Varsha", "Varsha", "Varsha", "Roopa", "Roopa", "Harsha", "Harsha", "Harsha"};
	    String target = "Harsha";
	    int first = -1;
	    int last = -1;
	    int start = 0;
	    int end = arr.length - 1;

	        
	    while (start <= end) {
	    	int mid = (start + end) / 2;
	        if (arr[mid].equals(target)) {
	        	first = mid;
	            end = mid - 1;       // Search LEFT
	        }
	        else if (arr[mid].compareTo(target) < 0) {
	        	start = mid + 1;     // Search RIGHT
	            }
	            else {
	            	end = mid - 1;
	            }
	        }

	        start = 0;
	        end = arr.length - 1;

	        // Find LAST occurrence
	        while (start <= end) {
	            int mid = (start + end) / 2;
	            if (arr[mid].equals(target)) {
	                last = mid;
	                start = mid + 1;      // Search RIGHT
	            }
	            else if (arr[mid].compareTo(target) < 0) {
	                start = mid + 1;
	            }
	            else {
	                end = mid - 1;
	            }
	        }

	        System.out.println("First = " + first);
	        System.out.println("Last = " + last);
	    }
	}


