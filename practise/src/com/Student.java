package com;

public class Student {
	int marks;
	String name;
	int roll;
	Student(int marks,String name,int roll){
		this.marks=marks;
		this.name=name;
		this.roll=roll;
	}
	void result(){
		System.out.println("student name "+name+" marks "+marks);
		if(marks<=34){
			System.out.println("fail");
		}else if(marks>=35){
			System.out.println("pass");
		}
	}

}
