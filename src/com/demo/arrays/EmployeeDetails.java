package com.demo.arrays;

public class EmployeeDetails {

	private int id;
	private String name;
	private int salary;
	
	public EmployeeDetails(int id, String name, int i) {
		super();
		this.id = id;
		this.name = name;
		this.salary = i;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
