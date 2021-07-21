package com.upcasting;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vechile v=new Car();
		Car c=(Car) v;
		c.start();
        c.stop();
        System.out.println(c.brand+" "+c.cost);
	}

}
