package com;

public class Vechile implements Person {
	
	
	@Override
public void details(){
		System.out.println("person is old aged person");
	}
public static void main(String[] args) {
	Vechile v=new Vechile();
	v.details();
 System.out.println(v.id);
	
}
}