package com.encapsulation;

public class Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.setBrand("suzuki");
		c.setCost(50000);
		c.setCost(100000);
		String brand=c.getBrand();
//		int cost=c.getCost();
		System.out.println(" "+brand);

	}

}
