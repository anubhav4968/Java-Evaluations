package com.question2;

public abstract class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	
	public Employee() {
		
	}
	abstract void calculateSalary();
	
	
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void diplay()
	{
		System.out.println("employeeId"+employeeId);
		System.out.println("employeeName"+employeeName);
	}
}
