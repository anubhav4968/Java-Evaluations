package com.masai;

public class Immutable {

	//strings are immutable in java with the help of SCP.
	//strings can be mutable by using StringBuilder form the syntax is-
	//StringBuilder str = new StringBuilder("Hello")
	
	String name= "Anubhav";
	
	String serName="Mishra";
	
	//Five methods of strings
	String FullName=name.concat(serName);
	boolean ans= name.equals(serName);
	int index=name.lastIndexOf("a");
	int leng=name.length();
	char ch= serName.charAt(4);
}
