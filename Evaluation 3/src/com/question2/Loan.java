package com.question2;

public class Loan {

	public double calculateLoanAmount(Employee employeeObj)
	{
		if(employeeObj instanceof PermanentEmployee)
		{
			PermanentEmployee pe = new PermanentEmployee();
			double salary= pe.getSalary();
			double loan = (salary*15)/100;
			return loan;
		}
		else 
		{
			TemporaryEmployee te = new TemporaryEmployee();
			double salary= te.getSalary();
			double loan = (salary*10)/100;
			return loan;
		}
	}
	private Loan()
	{
		
	}
	public static Loan getLoanObject()
	{
	 
		Loan l1 = new Loan();
		return l1;
	}
	
}
