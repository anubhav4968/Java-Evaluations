package com.question2;

public class PermanentEmployee extends Employee {

	private double basicPay;
	
	double PFamount = basicPay*0.12;
	@Override
	void calculateSalary() {
	 double	salary = basicPay-PFamount;
	 setSalary(salary);
	}

	public PermanentEmployee()
	{
		
	}
	
	public PermanentEmployee( int employeeId, String employeeName,double basicPay) {
		this.basicPay = basicPay;
		setEmployeeName(employeeName);
		setEmployeeId(employeeId);
	}

	
	
	
	
}
