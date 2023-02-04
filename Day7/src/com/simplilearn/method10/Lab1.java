package com.simplilearn.method10;

public class Lab1 {

	public static void main(String[] args) {
		
		// 1. Why main method is public ?
		// 2. Why main method is static ?
		// 3. Why main method is void ?
		// 4. Why name of the method in main ?
		// 5. Why main method takes argument as String Array : String[]
		// 6. What is the "args" in main method argument ?
		
		getMe();
		
		System.out.println("I am main");
	}
	
	
	public void main(int[] args) {
		System.out.println("I am Custom Main ");
	}

	public static void getMe() {
		System.out.println("I am get me");
	}
}
