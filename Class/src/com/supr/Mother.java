package com.supr;

public class Mother {
	Mother(String food){
//		this();
		System.out.println("mother gives food to child");
	}
	Mother(int salary){
		
		System.out.println("mother gets very less salary");
	}
	Mother(){
		this(22);
		System.out.println("mother is very hard working");
	}

}
