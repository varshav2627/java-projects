//jumping game
package day_10;

public class demo10 {
	public static void main(String[]args) {
		int[] nums= {2,1,1,1,4};
		int maxReach=0;
		for(int i=0;i<nums.length;i++) {
			//if current position cannot be reached
			if(i>maxReach) {
				break;
			}
			//find the farthest position we can reach
			maxReach=Math.max(maxReach, i+nums[i]);
		}
		if(maxReach >=nums.length-1) {
			System.out.println("can reach the last position");
		}else {
			System.out.println("cannot reach the last position");
		}
	}

}
