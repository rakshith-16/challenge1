package com.upcasting;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f=new Son();
		
		if(f instanceof Son){
			System.out.println("downcasting to son");
			Son s=(Son) f;
			System.out.println("father age"+s.age+"sons name "+s.name);
		}else if(f instanceof Daughter){
			System.out.println("downcasted to daughter");
			Daughter d=(Daughter)f;
			System.out.println(d.age+" "+d.age);
		}
	}

}
