package com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmw= new Car();
		Car audi= new Car();
		bmw.setModel("GTX");
		System.out.println(bmw.getModel());
		audi.setModel("AudiS");
		System.out.println(audi.getModel());
		audi.setBrand("Audi");

	}

}
