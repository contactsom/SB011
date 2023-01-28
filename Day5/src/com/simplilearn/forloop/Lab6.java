package com.simplilearn.forloop;

public class Lab6 {

	public static void main(String[] args) {
	
		int[] a = {10,20,30,40,50};
		System.out.println(a[0]);  	// At i=0 index value = 10
		System.out.println(a[1]);  	// At i=1 index value = 20
		System.out.println(a[2]);	// At i=2 index value = 30
		System.out.println(a[3]);	// At i=3 index value = 40
		System.out.println(a[4]);	// At i=4 index value = 50 
									// OR  At i<5 index value = 50
									// OR  At i<length of array index value = 50
		// length = 5
		
		// i want to print the array value form index 2 then what is the value of i = 2
		
		System.out.println("--------Using for loop----------------");
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
