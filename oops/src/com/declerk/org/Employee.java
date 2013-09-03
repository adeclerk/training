package com.declerk.org;

public abstract class Employee {
	private static  int empCount = 101;
	private int empNo;
	private String empName;
	private double salary;
		
	public Employee() {
		this("unknown",-1);
	}

	public Employee(String empName, double salary) {
		super();
		this.empNo = Employee.empCount ++;
		this.empName = empName;
		this.salary = salary;
	}
	
	public void payslip() {
		System.out.println("Emp #: " + this.empNo);
		System.out.println("Name: " + this.empName);
		System.out.println("Salary: $" + this.salary);
	}

	public double getSalary() {
		return salary;
	}
	
	
}
