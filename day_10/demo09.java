package day_10;

import java.util.*;

public class demo09 {
	public static void main(String[] args) {
		String[] meeting = {"A", "B", "C", "D", "E"};
		double[] start = {9.00, 9.30, 10.00, 11.00, 11.30};
		double[] end   = {10.00, 11.00, 11.00, 12.00, 1.00};

		double currentStart = start[0];
		double currentEnd = end[0];

		System.out.println("Merged intervals:");

		for (int i = 1; i < start.length; i++) {
			if (start[i] <= currentEnd) {
				currentEnd = Math.max(currentEnd, end[i]); 
		            } else {
		                System.out.println(currentStart + " - " + currentEnd);
		                currentStart = start[i];
		                currentEnd = end[i];
		            }
		        }
		        System.out.println(currentStart + " - " + currentEnd); 
		    }
		}

	