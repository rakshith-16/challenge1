package com.encapsulation;

public class Test {

	public static void main(String[] args) {
		Bankworker b=new Bankworker(101, 25000);
//		b.setId(102);
		b.setSalary(50000);
		int id=b.getId();
		int salary=b.getSalary();
		System.out.println(salary);
		System.out.println(id);
	}

}
