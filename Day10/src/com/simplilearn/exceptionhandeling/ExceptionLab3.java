package com.simplilearn.exceptionhandeling;

public class ExceptionLab3 {

	public static void main(String[] args) {
		
		getDivision(18, 0);
	}

	
	public static void getDivision(int a , int b) {
		
		int c = a/b;
		System.out.println(c);
	}
}
