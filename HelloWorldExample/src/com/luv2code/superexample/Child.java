package com.luv2code.superexample;

public class Child extends Parent {

	String name="Sushant";
	
	public void display()
	{
		
	System.out.println("Name is " +super.name );
	}
	
	public static void main(String[] args) {
		Parent obj1=new Child();
		obj1.display();
		

	}

}
