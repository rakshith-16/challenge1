package com;

public class Solution {

	
		public static void main(String[] args) {
			Hotel h=new Hotel("ashoka",5);
			Hotel o=new Hotel("oyo",3);
			Hotel[] x={h,o};
			for(int i=0;i<x.length;i++){
				x[i].display();
			}
			
			
		}

	}


