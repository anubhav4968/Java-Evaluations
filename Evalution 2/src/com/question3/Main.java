package com.question3;
import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number OF Bookings:");
		int bookings = scan.nextInt();
		System.out.println("Enter numberOfKMs:");
		int kms =  scan.nextInt();
		
		Car c = new Car(bookings,kms);
		
//		System.out.println(c.getNumberOfKMs());
		Ola myOla = new Ola();
		Car myCar = myOla.bookCar(bookings, kms);
//		System.out.println(myCar);
		int res = myOla.calculateBill(myCar,kms);
		System.out.println("The total fare amount is:"+ res);
	}
}
