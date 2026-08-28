package day_7;

public class demo07 {
	static void quickSort(int[] a, int left, int right) {
		if (left >= right) return;

	    int pivot = a[right];
	    int i = left - 1;

	    for (int j = left; j < right; j++) {
	    	if (a[j] < pivot) {
	    		i++;
	            int temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	            }
	        }

	        int temp = a[i + 1];
	        a[i + 1] = a[right];
	        a[right] = temp;

	        quickSort(a, left, i);
	        quickSort(a, i + 2, right);
	    }

	    public static void main(String[] args) {
	        int[] arr = {50, 20, 40, 10, 30};
	        quickSort(arr, 0, arr.length - 1);

	        for (int num : arr)
	            System.out.println(num);
	    }
	}


