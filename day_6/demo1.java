package day_6;

public class demo1 {
	public static void main(String[]args) {
		int[]numbers= {10,20,30,40,50};
		int windowSize=3;
		int sum=0;
		for(int i=0;i<windowSize;i++) {
			sum=sum+numbers[i];
		}
		System.out.println("sum="+sum);
		int starty=0;
		for(int end=windowSize;end<numbers.length;end++) {
			int start = 0;
			sum=sum-numbers[start];
			sum=sum+numbers[end];
			start++;
			System.out.println("sum="+sum);
		}

		
	}

}
