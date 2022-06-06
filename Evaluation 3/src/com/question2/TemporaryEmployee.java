package com.question2;

public class TemporaryEmployee  extends Employee{
	
	private int hoursWorked;
	private int hourlyWages;
	
	public TemporaryEmployee()
	{
		
	}
	
	public TemporaryEmployee(int employeeId, String employeeName,int hoursWorked,int hourlyWages) {
		this.hourlyWages = hourlyWages;
		this.hourlyWages = hourlyWages;
		setEmployeeName(employeeName);
		setEmployeeId(employeeId);
	}
	

	@Override
	void calculateSalary() {
		double salary = hoursWorked*hourlyWages;
		setSalary(salary);
	}

	
}
