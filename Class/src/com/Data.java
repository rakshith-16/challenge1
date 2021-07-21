package com;

public class Data {

	public static void main(String[] args) {
  Student s=new Student(16,"rakshith",22);
  Student s1=new Student(16,"karthik",25);
  Student s2=new Student(16,"govind",20);
  Student[] st={s,s1,s2};
  for(int i=0;i<st.length;i++){
	  st[i].details();
  }

  
		
		

	}

}
