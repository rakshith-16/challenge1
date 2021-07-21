package com.challenge;

public class Challenge3 {

	
	public void printequal(int a,int b, int c){
		if(a<=0 || b<=0 || c<=0){
			System.out.println("invalid text");
		}else if(a==b && a==c && b==a && b==c && c==a && c==b){
			System.out.println("all numbers are equal");
		}else{
			System.out.println("all numbers are different");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Challenge3 c=new Challenge3();
		c.printequal(10, 10, 10);
		c.printequal(0, 1, 1);
		c.printequal(15, 11, 10);
		

	}

}
