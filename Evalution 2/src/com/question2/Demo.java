
package com.question2;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter No. Of Student:");
		int noOfStudents = scan.nextInt();
	
		Student[] student = new Student[noOfStudents];
		
		int sum=0;
		for(int i=0;i<student.length;i++)
		{
			System.out.println("Enter Roll Number:");
			int roll = scan.nextInt();
			System.out.println("Enter Name:");
			String name = scan.next();
			System.out.println("Enter Address:");
		    String address = scan.next();
		    System.out.println("Enter Marks");
		    int marks = scan.nextInt();
		    sum = sum+marks;
		    Student s = new Student(roll,name,address,marks);
		    s.printDetails();
		}
		System.out.println("Average Marks of all the Students:"+(sum/student.length));
	}
}
