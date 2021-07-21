package com.upcasting;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vechile v=new Bike();
		if(v instanceof Car){
			System.out.println("downcasted to car");
			Car c=(Car)v;
			System.out.println("vechile brand "+c.brand+" "+c.cost);
			c.start();
			c.stop();
			System.out.println(".....................................");
			
		}
		if(v instanceof Bike){
			System.out.println("downcasted to bike");
			Bike b=(Bike)v;
			System.out.println(b.brand+" "+b.duke);
			b.pulsar();
		}
	}

	

}
