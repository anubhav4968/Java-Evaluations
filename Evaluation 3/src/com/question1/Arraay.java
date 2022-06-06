package com.question1;

import java.util.Scanner;

public class Arraay {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		try {
		System.out.println("Enter the number of elements in the array");
		int length = scan.nextInt();
		int[] array  = new int[length];
		for(int i=0;i<length;i++)
		{
			System.out.println("Enter the elements in the array");
			array[i]=scan.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access");
		int index = scan.nextInt();
		System.out.println("The array element at index"+index+"="+array[index]);
		System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException aibe)
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(Exception nfe)
		{
			System.out.println("java.lang.NumberFormatException");
		}
		
 }
}
