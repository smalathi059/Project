package com.demo.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {

	private String name;
	private String department;
	private double salary;
	public Employee(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee("Malathi", "HR", 25000));
		employee.add(new Employee("Deepthi", "IT", 30000));
		employee.add(new Employee("Venky", "HR", 20000));
		employee.add(new Employee("Lalitha", "Finance", 40000));
		employee.add(new Employee("Murali", "IT", 35000));
		employee.add(new Employee("Sai", "Finance", 45000));

		
		employee.stream().collect(Collectors.groupingBy(Employee::getDepartment, 
				Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))).
		forEach((department, employees) -> employees.ifPresent(emp -> System.out.println(department + ": " + emp.getName() + " - " + emp.getSalary())));

		}
	}
	
	


