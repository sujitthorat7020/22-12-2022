package com.exercise.bll;

public class Employee{
	
	private int id;
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee()
	{
		
	}

	public Employee(int id, String firstName, String lastName, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double raiseSalary(double amount) {
		
			//balance = balance + amount + (0.1 * amount);
			salary = salary + (10* amount);
			return salary;
		}
	public int AnnualSalary(int sal) {
		
	     return sal=sal*12;
}
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
}