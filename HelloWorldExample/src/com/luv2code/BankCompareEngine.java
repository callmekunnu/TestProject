package com.luv2code;

public class BankCompareEngine{

	public void saveInterestRateOf(Bank bank)
	{
	int rate=bank.getRateOfInterest();
		System.out.println(rate);
	}
 
	
	public static void main(String[] args) {
	Bank b1=new Sbi();
		BankCompareEngine b=new BankCompareEngine();
		b.saveInterestRateOf(b1);
	}

}
