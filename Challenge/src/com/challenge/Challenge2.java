package com.challenge;

public class Challenge2 {
	
public String area(double radius){
	if(radius<=0){
		return "invalid value :"+-1.0;
	}else{
		return "the area of circle is :"+(3.14*radius)+" m2";
	}

}
public String area(double x,double y){
	if(x<=0 || y<=0){
		return "invalid value "+-1.0;
	}else{
		return "area of rectangle :"+ x*y+" square unit";
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Challenge2 c=new Challenge2();
		System.out.println(c.area(25.00));
		System.out.println(c.area(15,35));

	}

}
