package com.challenge;

public class challenge1 {
	
	 public String getDurationString(int minute ,int seconds){
		 
				if(minute>=0){
					if(seconds>=0 && seconds<=59){
						return ""+( minute/60+"h "+seconds/60+"m "+seconds+"sec" );
						
//						
						
						
					}else{
						return "inavlid value";
//						
					}
				}
				return "inavlid";
	 }
	 public String getDurationString(int seconds){
		 String string="";
		 if(seconds>=0  ){
			 string = getDurationString(seconds/60, seconds % 60);
//		return "0h "+seconds/60+"m "+seconds+"s ";
		 }else{
			 return "invalid value";

		 }
		 return string;
		 	 }
	 
	 
	 public static void main(String[] args) {
		challenge1 c=new challenge1();
		System.out.println(c.getDurationString(120));
		System.out.println(c.getDurationString(120, 60));
		System.out.println(c.getDurationString(80, 15));

	     System.out.println(c.getDurationString(90, 35));

		
	}

}