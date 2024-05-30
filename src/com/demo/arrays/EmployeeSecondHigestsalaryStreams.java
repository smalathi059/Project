package com.demo.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeSecondHigestsalaryStreams {

	public static void main(String[] args) {
		List<EmployeeDetails> employee =new ArrayList<EmployeeDetails>();
		employee.add(new EmployeeDetails(1, "Malathi", 45000));
		employee.add(new EmployeeDetails(2, "Deepu", 20000));
		employee.add(new EmployeeDetails(3, "Venky", 50000));
		employee.add(new EmployeeDetails(4, "Yashmitha", 30000));
		employee.add(new EmployeeDetails(5, "Murali", 55000));
		

		Optional<EmployeeDetails> secondHighestSalary = employee.stream()
		        .sorted(Comparator.comparingDouble(EmployeeDetails::getSalary).reversed()).skip(1).findFirst();

		if (secondHighestSalary.isPresent()) {
            System.out.println("The second highest salary is: " + secondHighestSalary.get());
        } else {
            System.out.println("There is no second highest salary.");
        }	}

}
