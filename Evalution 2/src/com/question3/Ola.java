package com.question3;

public class Ola {
	public Car bookCar(int numberOfPassenger, int numberOfKMs)
	{
		
		if(numberOfPassenger<=3)
		{
			HatchBack hb = new HatchBack();
			return hb;
		}
		else{
			Sedan sd = new Sedan();
			return sd;
		}
		
	}
	public int calculateBill(Car car,int kms) {
	  if(car.toString().equals("com.question3.HatchBack@6fadae5d")) {
		  HatchBack hb = new HatchBack();
		  
		  int totalFare = (kms)*(hb.farePerKm);
			 return totalFare;
	  }
	  else
	  {
		  Sedan s = new Sedan();

		  int totalFare = (kms)*(s.farePerKm);
			 return totalFare;
	  }
	 
	}
	
}
class Car {
	

	private int numberOfPassengers;
	private int numberOfKMs;
	
    public Car() {
		
	}
	public Car(int numberOfPassengers, int numberOfKMs) {
		super();
		
		this.numberOfPassengers = numberOfPassengers;
		this.numberOfKMs = numberOfKMs;
	}
	
	
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	public int getNumberOfKMs() {
		return numberOfKMs;
	}
	public void setNumberOfKms(int numberOfKMs) {
		this.numberOfKMs = numberOfKMs;
	}
	
	
}

class Sedan extends Car{
	 int farePerKm = 20;
	
}

class HatchBack extends Car{
	int farePerKm =15;
	
}







