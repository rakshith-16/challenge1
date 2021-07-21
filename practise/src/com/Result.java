package com;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s3=new Student(36,"rakshith",25);
		Student s1=new Student(31,"govind",26);
		Student s2=new Student(35,"karthik",27);
		Student[] s={s1,s2,s3};
		for(int i=0;i<s.length;i++){
			s[i].result();
		}



	}

}
