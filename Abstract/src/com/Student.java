package com;

public class Student {
	int id;
	String name;
	int age;
	Student(int id,String name,int age){
		this.age=age;
		this.name=name;
		this.id=id;
	}
	public static void main(String[] args) {
		Student s=new Student(22,"govind",101);
		Student s1=new Student(22,"rakshith",101);
		Student s2=new Student(22,"karthik",101);
		Student[] z={s,s1,s2};
		for(int i=0;i<z.length;i++){
			System.out.println(z[i].name);
			System.out.println(z[i].id);
			System.out.println(z[i].age);
		}

		
	
	
}

}