package com;

public class Student {
int age;
String name;
int marks;
public Student(int age, String name, int marks) {
	super();
	this.age = age;
	this.name = name;
	this.marks = marks;
}
public void details(){
	System.out.println("student name is "+name+" age "+age+" marks scored is "+marks);
	if(marks<25){
		System.out.println("student is failed the exam");
	}else{
		System.out.println("student has passed the exam");
	}
}

}
