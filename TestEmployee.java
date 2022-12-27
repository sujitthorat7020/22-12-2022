package com.exercise.pll;

import com.exercise.bll.Employee;

public class TestEmployee {

	public static void main(String[] args) {

		Employee n1=new Employee(101,"Adwait","Garud",50000);
		System.out.println("----Employeee Record-----");
		System.out.println(n1.getFirstName());
		System.out.println(n1.getLastName());
		double sal=n1.raiseSalary(50000);
		System.out.println("Raise Salary :"+sal);
		int annsal= n1.AnnualSalary(50000);
		System.out.println("Annual Salary :"+annsal);
	}

}