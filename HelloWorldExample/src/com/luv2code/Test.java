package com.luv2code;

public class Test {

	public static void main(String[] args) {
		
		Bank b1=new Sbi();
		System.out.println("The Interest Rate of SBI :"+ " "+b1.getRateOfInterest()+"%");
		
		Bank b2=new Pnb();
		System.out.println("The Interest Rate of PNB :"+" "+b2.getRateOfInterest()+"%");

	}

}
