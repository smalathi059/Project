package com.demo.arrays;

import java.util.ArrayList;
import java.util.List;

public class EmployeesSecondHighestSalary {

	public static void main(String[] args) {
		List<EmployeeDetails> employee =new ArrayList<EmployeeDetails>();
		employee.add(new EmployeeDetails(1, "Malathi", 45000));
		employee.add(new EmployeeDetails(2, "Deepu", 20000));
		employee.add(new EmployeeDetails(3, "Venky", 50000));
		employee.add(new EmployeeDetails(4, "Yashmitha", 30000));
		employee.add(new EmployeeDetails(5, "Murali", 55000));
		
		double maxSalary = Double.MIN_VALUE;
		double secondMaxSalary = Double.MIN_VALUE;
		
		for(EmployeeDetails emp:employee) {
			double salary=emp.getSalary();
			if(salary>maxSalary) {
				secondMaxSalary = maxSalary;
				maxSalary = salary;
			}else if(salary>secondMaxSalary && salary!= maxSalary) {
				secondMaxSalary = salary;
			}
		}
		 if (secondMaxSalary == Double.MIN_VALUE) {
	            System.out.println("There is no second highest salary.");
	        } else {
	            System.out.println("The second highest salary is: " + secondMaxSalary);
	        }

	}

}
