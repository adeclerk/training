package com.declerk.org;

public class Executive extends Employee {

	private double comission;

	public Executive(String empName, double salary, double comission) {
		super(empName, salary);
		this.comission = comission;
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("Comission: " + this.comission);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() + comission;
	}
	
	
}
