package com;

public class Dinga {
Dinga(){
this(2);
	System.out.println("hi dinga");
	
}
Dinga(int a){
	this("hello");
	System.out.println("bye dinga");
}
Dinga(String h){
	System.out.println("this life sucks");
}
public static void main(String[] args) {
	Dinga d=new Dinga();
	System.out.println();
}

}
