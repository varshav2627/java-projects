//DNF(Ducth National Flag)
package day_7;

public class demo08 {
	public static void main(String[]args) {
		int[]arr= {2,0,1,2,0,1};
		int low=0;
		int mid=0;
		int high=arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				//put 0 on the left
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
			}else if(arr[mid]==1) {
				// 1 belong in the middle
				mid++;
			}else {
				//put 2 on the right
				int temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
			}
		}
		//print result
		for(int n:arr) {
			System.out.println(n + "");
		}
	}

}
