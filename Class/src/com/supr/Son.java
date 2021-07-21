package com.supr;

public class Son extends Mother{
	Son(char a){
//		super(25000);
	
		System.out.println("son initial is mothers name");
	}
	Son(String school){
		this('a');
		System.out.println("son goes to school");
	}
}
