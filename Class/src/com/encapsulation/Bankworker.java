package com.encapsulation;

public class Bankworker {
private int id;
private int salary;
	public Bankworker(int id, int salary) {
	this.id = id;
	this.salary = salary;
}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
