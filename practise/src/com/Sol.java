package com;

public class Sol {

	public static void main(String[] args) {
		Worker w=new Worker("rakshith",22,"kengri");
		Worker w1=new Worker("karthik",21,"kengri");
		Worker w2=new Worker("govind",23,"kengri");
		Worker[] z=new Worker[3];
		z[0]=w;
		z[1]=w1;
		z[2]=w2;
		for(int i=0;i<z.length;i++){
//			System.out.println(z[0].name);
			System.out.println(z[i].name);
//			
		}
	

	}

}