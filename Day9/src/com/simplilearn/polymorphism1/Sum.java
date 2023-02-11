package com.simplilearn.polymorphism1;

public class Sum {

	public static void main(String[] args) {
		
		Sum sum = new Sum();
		sum.getSum(5, 6);
		sum.getSum(5, 6, 7);
		sum.getSum(5, 6, 7, 8);
		//sum.getSum(5, 6, 7, 8, 9);
		// The method getSum(int, int, int, int) in the type Sum is not applicable for the arguments (int, int, int, int, int)
	}
	
	
	public void getSum(int a , int b) {
		int x= a+b;// x = 5 + 6
		System.out.println("Sum of a + b is :"+x);
	}
	
	public void getSum(int a , int b, int c) {
		int x= a+b+c;// x = 5 + 6 + 7
		System.out.println("Sum of a + b + c is :"+x);
	}
	
	public void getSum(int a , int b, int c, int d) {
		int x= a+b+c+d;// 5 + 6+ 7+ 8
		System.out.println("Sum of a + b + c + d is :"+x);
	}
}
