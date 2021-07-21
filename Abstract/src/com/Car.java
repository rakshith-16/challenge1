package com;

public  class Car extends Bank implements A,B {
	
	@Override
	public void eat(){
		System.out.println("iam having food");
	}
	@Override
	public void food(){
		System.out.println("i love food");
	}
	public static void main(String[] args) {
		Car c=new Car();
	
		
	}


}
