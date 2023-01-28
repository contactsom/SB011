package com.simplilearn.foreachloop;

public class Lab1 {

	public static void main(String[] args) {
		
		// Data type of a = int[] = denotes more than one value , hence data type in int []
		// Data type of a[index] = denotes one value , hence data type in int 
		
		
		int[] a = {10,20,30,40,50};
		System.out.println(a[0]); 
		System.out.println(a[1]);    
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println("********For Each Loop *********");
		
		for(int arr: a) {
			System.out.println(arr);
			System.out.println("----");
		}
		
		
	}

}
