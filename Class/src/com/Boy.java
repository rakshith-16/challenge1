package com;

public class Boy {
	Boy(String name){
		this(25000,"b,e");
		System.out.println("name of the boy is appi");
	}
	Boy(int age){
		System.out.println("age is 22");
	}
	Boy(int salary,String education){
		this(22);
		System.out.println(25000+"salary"+" completed "+"b.e");
	}
  Boy(){
	  this("appi");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy b=new Boy();
//		Boy b1=new Boy(25000+" "+"b.e");

	}

}
