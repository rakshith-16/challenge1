package com;

public class Employee {
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void display(){
		System.out.println("emp name is "+name+" and id is "+id);
	}
	public static void main(String[] args) {
		Employee e=new Employee(101,"rakshith");
		Employee e1=new Employee(101,"rakshith");
		Employee e2=new Employee(101,"rakshith");
//		Employee[] f={e,e1,e2};
		Employee [] a=new Employee[3];
		a[0]=e;
		a[1]=e1;
		a[2]=e2;
		for(int i=0;i<a.length;i++){
			a[i].display();
		}


		
	}
	

}
