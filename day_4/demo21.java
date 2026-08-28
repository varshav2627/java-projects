package day_4;
import java.util.Scanner;

public class demo21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Restaurant Menu -----");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Pasta");
        System.out.println("4. Sandwich");
        System.out.println("5. KFC");
        System.out.println("Enter your choice (1-5):");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected: Pizza");
                break;
            case 2:
                System.out.println("You selected: Burger");
                break;
            case 3:
                System.out.println("You selected: Pasta");
                break;
            case 4:
                System.out.println("You selected: Sandwich");
                break;
            case 5:
                System.out.println("You selected: KFC");
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 5.");
        }

        sc.close();
    }
}


