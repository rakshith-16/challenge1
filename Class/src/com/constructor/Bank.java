package com.constructor;

public class Bank {
	private int accno;
	private String name;
	private String email_id;
	private int phno;
	private int balance;
	private int deposit;
//	making all data to be initialised from the constructors
	public Bank(int accno, String name, String email_id, int phno, int balance) {
		
		this.accno = accno;
		this.name = name;
		this.email_id = email_id;
		this.phno = phno;
		this.balance = balance;
	}
	public void bankdeposit(int deposit){
		this. balance+=deposit;
		if(balance<1000){
			System.out.println("balance is low");
		}else{
			System.out.println("your balance amt is "+this.balance);
		}
	}
	public void withdraw(int draw){
		this.balance-=draw;
		if(this.balance<=1000){
			System.out.println("insufficient balanceXXXX"+this.balance);
		}else{
			System.out.println("your balance is"+this.balance);
		}
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	

}
