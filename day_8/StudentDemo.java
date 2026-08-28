package day_8;

import java.util.Scanner;


class Student {
	    // instance variables
	    String name;
	    int age;
	    double marks;

	    // constructor
	    Student(String name, int age, double marks) {
	        this.name = name;
	        this.age = age;
	        this.marks = marks;
	    }

	    // method to display student details
	    void display() {
	    	System.out.println("-------------------");
	        System.out.println("Name: " + this.name);
	        System.out.println("Age: " + this.age);
	        System.out.println("Marks: " + this.marks);
	        System.out.println("-------------------");
	    }

	    // method to check pass/fail
	    void checkResult() {
	        if (this.marks >= 40) {
	            System.out.println("Result: Pass");
	        } else {
	            System.out.println("Result: Fail");
	        }
	    }
	}

	public class StudentDemo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter age: ");
	        int age = Integer.parseInt(sc.nextLine());

	        System.out.print("Enter marks: ");
	        double marks = Double.parseDouble(sc.nextLine());

	        // creating object using constructor
	        Student s1 = new Student(name, age, marks);

	        // calling methods
	        s1.display();
	        s1.checkResult();

	        sc.close();
	    }
	}

	    	


