package com.challenge;

public class challenge1 {
	int minute;
	int seconds;
//	int hour=12;
	 public String getDurationString(double minute ,double seconds){
		 
				if(minute>=0){
					if(seconds>=0 && seconds<=59){
						return "( "+minute/60+"mins."+seconds/60+"sec )" ;
						
//						
						
						
					}else{
						return "inavlid value";
//						
					}
				}
				return "inavlid";
	 }
	 public String getDurationString(double seconds){
		 if(seconds>=0){
		return ""+seconds/60+" mins";
		 }
		 return "invalid value";
	 }
	 
	 public static void main(String[] args) {
		challenge1 c=new challenge1();
		System.out.println(c.getDurationString(90));

						System.out.println(c.getDurationString(90, 35));

		
	}

}
