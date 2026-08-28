package day_6;

public class demo13 {
	public static void main(String[] args) {
		int[] array = {50, 20, 40, 10, 30};

	    for (int i = 0; i < array.length - 1; i++) {
	    	int minIndex = i;

	    for (int j = i + 1; j < array.length; j++) {
	    	if (array[j] < array[minIndex]) {
	    		minIndex = j;
	                }
	            }

	           
	            int temp = array[minIndex];
	            array[minIndex] = array[i];
	            array[i] = temp;
	        }

	        System.out.println("Array sorted in ascending order (in-place):");
	        for (int i = 0; i < array.length; i++) {
	            System.out.println(array[i]);
	        }
	    }
	}


