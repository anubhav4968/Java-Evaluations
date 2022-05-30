package com.masai;

public class ShapeMain {
	
	
	public static void main(String[] args) {
		Shapes s1 = new Shapes();
		s1.area(10);
		
		s1.area(10,6);
		
		s1.area(5);
		
		// the meaning of static polyMorphism is same methods name but the parameters will be different.
		//it means method will be called , decide at compile time only.
	}
}
