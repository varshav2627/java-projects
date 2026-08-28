package day_4;

public class totalsalary {
    public static void main(String[] args) {
        int[] salaries = {10000, 15000, 12000, 18000, 20000};
        int total = 0;

        for (int i = 0; i < salaries.length; i++) {
            total += salaries[i];
        }

        System.out.println("Individual Salaries:");
        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Employee " + (i + 1) + ": " + salaries[i]);
        }

        System.out.println("Total Salary: " + total);
    }


}
 