package com.question1;

public class ISA {

	//ISA relationship : this can be access by creating an object
	//in extended class(i.e. child class)
	//it is static compile time binding
	
	public static void main(String[] args) {
	 NickName n = new NickName();
	 n.print();
	}
}

class Name{
	public void print() {
		System.out.println("My Name is Anubhav");
	}
}

class NickName extends Name{
	public void printnick() {
		System.out.println("My Name is Om");
	}
}
