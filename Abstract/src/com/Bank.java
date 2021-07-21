package com;

public  class Bank implements A,B  {
	
@Override
public void m1(){
	System.out.println("this is m1");
}
@Override
public void m1(int x){
	System.out.println(x);
}
public static void main(String[] args) {
	Bank b=new Bank();
	b.m1();
	b.m1(22);
}


	}


