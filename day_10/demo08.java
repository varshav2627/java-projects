package day_10;

public class demo08 {
	public static void main(String[] args) {
		int[] arrival = {9, 9, 10, 10, 11};
		int[] departure = {10, 11, 10, 11, 12};

		int lastEnd = departure[0];
		System.out.println("selected activity: A1");

		for (int i = 1; i < arrival.length; i++) {
			if (arrival[i] >= lastEnd) {
				System.out.println("selected activity: A" + (i + 1));
				lastEnd = departure[i];
				}
			}
		}
	}