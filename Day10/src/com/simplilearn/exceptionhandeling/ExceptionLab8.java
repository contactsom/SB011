package com.simplilearn.exceptionhandeling;

public class ExceptionLab8 {

	public static void main(String[] args) {
		
		getDivision(18, 2);
	}

	
	public static void getDivision(int a , int b) {
		
		
		try {
			System.out.println("I am in try");
			int c = a/b;// risky code 
			System.out.println(c);
			System.exit(0);// Terminate JVM
			
		} catch (Exception e) {
			System.out.println("Please check your input ");
			System.out.println("I am in Catch");
			
		}finally {
			System.out.println("I am in Finally");
		}
		
		
		
	}
}
