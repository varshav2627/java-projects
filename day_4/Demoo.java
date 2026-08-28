package day_4;

import java.util.Scanner;



public class Demoo {
	static int getFixedSalary(String designation) {
        switch (designation) {
            case "programmer":
                return 15000;
            case "tester":
                return 20000;
            case "manager":
                return 30000;
            default:
                return 0;
        }
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int age = 0;
        String designation = "";
        int salary = 0;
        int choice;
        do {
            System.out.println("\n1) Create");
            System.out.println("2) Display");
            System.out.println("3) Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    name = sc.next();
                    System.out.print("Enter age: ");
                    age = sc.nextInt();
                    if (age < 18 || age > 60) {
                        System.out.println("Invalid age");
                        continue;
                    }
                    System.out.print("Enter designation: ");
                    designation = sc.next();
                    if (!designation.equals("programmer") &&
                    		!designation.equals("manager") &&
                    		!designation.equals("tester")) {
                    System.out.println("Invalid designation");
                    break;
                }
                    // Fixed salary assigned based on designation
                    salary = getFixedSalary(designation);
                    System.out.println("Fixed Salary Assigned: " + salary);
                    break;
                case 2:
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Designation: " + designation);
                    System.out.println("Salary: " + salary);
                    break;
                case 3:
                    salary = salary + 5000;
                    System.out.println("New Salary: " + salary);
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }

}
