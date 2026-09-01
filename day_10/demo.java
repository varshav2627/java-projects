//greedy algorithm
package day_10;


public class demo {
	public static void main(String[]args) {
		int[]start= {1,2,3,4,5,6};
		int[]end= {3,4,5,7,8};
		
		int lastEnd=end[0];
		System.out.println("selected activity:A");
		
		for(int i=1;i<start.length;i++) {
			if(start[i]>=lastEnd) {
				System.out.println("activity"+(i+1));
				lastEnd=end[i];
			}
		}
		}
	}
	


