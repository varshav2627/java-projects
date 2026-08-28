package day_8;

import java.util.*;

class Employee{
	String name;
	String department;
	int salary;
	Employee(String name , String deparment,int salary){
		this.name=name;
		this.department=deparment;
		this.salary=salary;
	}
	public String toString() {
		return name + "-"+department + "-" +salary;
	}
}

public class demo07 {
	public static void main(String[]args) {
		
		List<Employee>employees=Arrays.asList(
				new Employee("Ravi","IT",6000),
				new Employee("Anil","HR",5000),
				new Employee("Priya","IT",5000),
				new Employee("Amit","HR",6000),
				new Employee("Rahul","AT",5000)
        );
		//sort by 3 keys
		employees.sort(
		Comparator.comparing((Employee e)-> e.department)
		.thenComparing((Employee e)->e.salary,Comparator.reverseOrder())
		.thenComparing(e -> e.name)
		);
		for(Employee e:employees) {
			System.out.println(e);
		}
	}

}
