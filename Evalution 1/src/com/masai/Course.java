package com.masai;
import java.util.Scanner;
public class Course {

	 int courseId;
	 String  courseName;
	 int  courseFee;
	 
	 public void displayCourseDetails() {
		 System.out.println("CourseId:"+courseId);
		 System.out.println("CourseName:"+courseName);
		 System.out.println("CourseFee:"+courseFee);
	 }
	 public static void authenticate(String Username,String Password) {
		 
		 Course c = new Course();
		 
		 if(Username=="Admin" && Password=="1234") {
			 Scanner scan = new Scanner(System.in);
			 
			 System.out.println("Enter CousreId");
			 c.courseId =scan.nextInt(); 
			 
			 System.out.println("Ente Coursename");
			 c.courseName=scan.next();
			 
			 System.out.println("Enter CousrseFee");
			 c.courseFee = scan.nextInt();
			 
			 c.displayCourseDetails();
		 }
		 else
		 {
			 System.out.println("Invalid Username or password");
		 }
	 }
	 public static void main(String[] args) {
		 
		 authenticate("Admin","1234");
		 authenticate("Admin","123");
		 
	}
}
