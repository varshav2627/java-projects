package day_8;

import java.util.*;

class Employee {
    String name;
    String department;
    int salary;

    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return name + "-" + department + "-" + salary;
    }
}

public class demo08 {
	public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Ravi", "IT", 6000),
                new Employee("Anil", "HR", 5000),
                new Employee("Priya", "IT", 5000),
                new Employee("Amit", "HR", 6000),
                new Employee("Rahul", "AT", 5000)
        ));

        // sort by salary ascending
        employees.sort(Comparator.comparing(e -> e.salary));

        for (Employee e : employees) {
            System.out.println(e);
        }
    }

		}


