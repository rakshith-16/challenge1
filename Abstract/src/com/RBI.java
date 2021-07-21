package com;

public  class RBI  {
	public static void main(String[] args) {
		
	
	SBI s=new SBI(22,"raj",101);
	SBI u=new SBI(23,"show",102);
	System.out.println(s.name+" "+s.age+" "+s.id);
	System.out.println(u.name+" "+u.age+" "+u.id);
	SBI[] b=new SBI[2];
	b[0]=s;
	b[1]=u;
  for(int i=0;i<b.length;i++){
	  System.out.println(b[0].name+" "+b[0].age+" "+b[0].id);
  }
	}
	}
	
	
	
	
	


