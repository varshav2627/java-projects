package day_4;

public class highestmarks {
	public static void main(String[] args) {
        int[] marks = {78, 65, 89, 92, 71};
        int highest = marks[0];

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        System.out.println("Marks of students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("Highest Marks: " + highest);
    }
}

