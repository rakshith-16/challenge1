package com;

public class Amazon {
	Amazon(String product){
		System.out.println(product);
	}
	Amazon(int cost,String product){
		System.out.println(product+" "+cost);
	}
	Amazon(String product,int cost){
		System.out.println(product+" "+cost);
	}
	Amazon(int cost){
		System.out.println(cost);
	}
	public static void main(String[] args) {
		Amazon a=new Amazon("puma");
		
	}
	

}
