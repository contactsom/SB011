package com.simplilearn.forloop;

public class Lab10 {

	public static void main(String[] args) {
	
		int[] a = {10,20,30,40,50};
		// 1. add one value in array
		// OR
		// 2. i<5
	
		for(int i = 0;i<5;i++) {
			
			System.out.println(a[i]);
		}
		
		//  vs
		System.out.println("---------------");
		
		for(int i = 0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
	
	
	
		

	}

}
