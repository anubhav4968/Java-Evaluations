package com.masai;

public class Students {

	private int rollNumber;
	private String studentName;
	private int marks;
	
	Students(){
		
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Students(int rollNumber, String studentName, int marks) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}
	
	public void ShowDetails() {
		System.out.println("Student Roll Number:"+rollNumber);
		System.out.println("Student Name"+studentName);
		System.out.println("Student Marks:"+marks);
		System.out.println("=============");
	}
	
	
}
