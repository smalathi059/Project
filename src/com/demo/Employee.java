package com.demo;

import java.util.ArrayList;
import java.util.List;


public class Employee {
	
	

	public static void main(String[] args) {
		List<Employeedetails> employee= new ArrayList<>();
		employee.add(new Employeedetails(1,"Malathi",25,"Female",30000));
		employee.add(new Employeedetails(2, "Jagan",27,"Male",100000));
		employee.add(new Employeedetails(3, "Deepthi",20,"Female",250000));
		employee.add(new Employeedetails(4,"Venky",19,"Male",10000));
		employee.add(new Employeedetails(5,"Dinu",17,"Male",24000));
		employee.add(new Employeedetails(6,"Deekshu",12,"Male",20000));
		
		//How many male and female employees are there in the organization
		long maleCount = employee.stream().filter(empl->empl.getGender().equalsIgnoreCase("Male")).count();
		System.out.println("maleCount=>"+maleCount);
		
		long femalCount = employee.stream().filter(empl->empl.getGender().equalsIgnoreCase("Female")).count();
		System.out.println("femalCount=>"+femalCount); 	
		
		//Take out average salary based on employee gender
		double averageMaleSalary = employee.stream()
                .filter(empl -> empl.getGender().equalsIgnoreCase("Male"))
                .mapToDouble(Employeedetails::getSalary)
                .average()
                .orElse(0); 

        System.out.println("Average Male Salary: " + averageMaleSalary);

        double averageFemaleSalary = employee.stream()
                .filter(empl -> empl.getGender().equalsIgnoreCase("Female"))
                .mapToDouble(Employeedetails::getSalary)
                .average()
                .orElse(0); 
        System.out.println("Average Female Salary: " + averageFemaleSalary);

	}
	

}
