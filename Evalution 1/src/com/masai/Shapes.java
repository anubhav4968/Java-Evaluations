package com.masai;

public class Shapes {

	public void area(double radius) {
		double area = (4/3)*(22/7)*(radius*radius);
		System.out.println("Area Of A circle: "+area);
	}
	
	public void area(int length, int breath) {
		int area = 2*(length+breath);
		System.out.println("Area Of A Reactangle: "+area);
	}
	
	public void area(int side) {
		int area = side*side;
		System.out.println("Area Of A Square: "+area);
	}
}
