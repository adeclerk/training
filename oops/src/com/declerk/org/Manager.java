package com.declerk.org;

public class Manager extends Employee {

	private double bonus;
	
	public Manager() {
		this("unknown name", -1, -1);
	}

	public Manager(String empName, double salary, double bonus) {
		// Calling parameterized constructor from Employee
		super(empName, salary);
		// TODO Auto-generated constructor stub
		this.bonus = bonus;
	}

	@Override
	public void payslip() {
		// Call payslip of superclass Employee
		super.payslip();
		System.out.println("Bonus: $" + this.bonus);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() + this.bonus;
	}
	
	
	
}
