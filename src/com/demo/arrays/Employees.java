package com.demo.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employees {

	public static void main(String[] args) {
		List<EmployeeDetails> employee =new ArrayList<EmployeeDetails>();
		employee.add(new EmployeeDetails(1, "Malathi", 45000));
		employee.add(new EmployeeDetails(2, "Deepu", 20000));
		employee.add(new EmployeeDetails(3, "Venky", 50000));
		employee.add(new EmployeeDetails(4, "Yashmitha", 30000));
		employee.add(new EmployeeDetails(5, "Murali", 45000));
		
//        List<EmployeeDetails> topThree = findTopThreeHighestPaidEmployees(employee);
//
//		for(EmployeeDetails employees: topThree) {
//			System.out.println(employees.getId()+" "+employees.getName()+" "+employees.getSalary());
//		}
//		
//	}
//
//	private static List<EmployeeDetails> findTopThreeHighestPaidEmployees(List<EmployeeDetails> employee) {
//		
//		 employee.sort(Comparator.comparingDouble(EmployeeDetails::getSalary).reversed());
//
//	        // Select top three employees
//	        return employee.subList(0, Math.min(3, employee.size()));
//	}
		//List<EmployeeDetails> topThree = findTopThreeHighestPaidEmployees(employee);

        System.out.println("Top three highest paid employees:");
        
        List<EmployeeDetails> topThree = employee.stream().sorted(Comparator.comparingDouble(EmployeeDetails::getSalary).reversed())
        		.limit(3).collect(Collectors.toList());
        
        System.out.println(topThree);
        
    }


}
