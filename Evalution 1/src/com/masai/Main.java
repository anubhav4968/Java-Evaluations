package com.masai;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter No of Students");
		int Student = scan.nextInt();
		System.out.println("=========================");
		
		for(int i=0;i<Student;i++)
		{
			System.out.println("Enter the Roll Number :");
			int roll = scan.nextInt();
			
			System.out.println("Enter the Name :");
			String name = scan.next();
			
			System.out.println("Enter the marks :");
			int marks = scan.nextInt();
			
			Students student = new Students(roll,name,marks);
			student.ShowDetails();
		}
		
		
		
		
		
	}
}
