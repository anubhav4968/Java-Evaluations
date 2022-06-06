package com.question2;

public class Main {

	public static void main(String[] args) {
		Loan l1 = Loan.getLoanObject();
		PermanentEmployee pe = new PermanentEmployee(123,"ANubhav",30000);
		System.out.println(l1.calculateLoanAmount(pe));
		
		
		
		TemporaryEmployee te = new TemporaryEmployee(123,"ANubhav",56,46);
		System.out.println(l1.calculateLoanAmount(te));
	}
}
