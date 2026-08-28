package day_4;

public class demoo3 {
	
	    public static void main(String[] args) {
	        int[] marks = {35, 67, 89, 22, 45, 30, 76};
	        int passCount = 0;

	        System.out.println("Marks of students:");
	        for (int i = 0; i < marks.length; i++) {
	            System.out.println("Student " + (i + 1) + ": " + marks[i]);
	            if (marks[i] >= 40) {
	                passCount++;
	            }
	        }

	        System.out.println("Number of students passed: " + passCount);
	    }
	}


