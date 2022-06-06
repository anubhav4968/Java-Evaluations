package com.question4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Username");
		String user = scan.next();
		
		System.out.println("Enter Password");
		String Password=scan.next();
		
		System.out.println("Enter Mobile Number");
        String mobileNumber= scan.next();
        
        System.out.println("Enter Email");
        String email = scan.next();
        
        if(user.matches("[a-z]{3,8}") && Password.matches("\\w{3,8}") && mobileNumber.matches("[6,7,8,9]{1}[0-9]{9}") && email.matches(".{6,20}") )
        {
        	Customer cust = new Customer(user,Password,mobileNumber,email);
        	cust.display();
        }
        else
        {
        	System.out.println("Enter valid detils");
        }
        	
        	
		
	}

}
