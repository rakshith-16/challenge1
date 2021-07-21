package com;

public class Uday {
	
Uday(int cost){
	System.out.println(cost);
}
Uday(String brand,int cost){
	System.out.println(brand+" "+cost);
}
Uday(int price,String use){
	System.out.println(price+" "+use);
}

public static void main(String[] args) {
  Uday u=new Uday(25);
  Uday u1=new Uday(25,"bags");
  Uday u2=new Uday("i dont know",25);
  



}

}
