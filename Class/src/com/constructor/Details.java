package com.constructor;

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank(12345,"rakshith","rakshith@16",12345678,3000);
		System.out.println(b.getBalance());
		System.out.println(b.getName());
		b.bankdeposit(5000);
		b.withdraw(7000);
		
		b.bankdeposit(5000);
		b.bankdeposit(15000);
		b.bankdeposit(25000);
		b.withdraw(400000);

		

	
		
		
		

	}

}