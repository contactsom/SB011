package com.simplilearn.method1;

public class Lab2 {

	public static void main(String[] args) {
		
		Lab2 lab2 = new Lab2();
		lab2.getAdd(20, 30);

	}

	
	public void getAdd(int a,int b) {
		int c = a+b;
		System.out.println("Addition : "+c);
	}
	
	public void getMultiply(int a,int b) {
		int c = a*b;
		System.out.println("Multiplication : "+c);
	}
	
	public void getDivision(int a,int b) {
		int c = b/a;
		System.out.println("Multiplication : "+c);
	}
}
