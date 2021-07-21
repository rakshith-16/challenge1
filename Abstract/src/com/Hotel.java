package com;

public class Hotel {
	String name;
	int rating;
	Hotel(String name,int rating){
		this.name=name;
		this.rating=rating;
		
	}
	public void display(){
		System.out.println("hotel name "+name+" rating "+rating);
	}
	

}
