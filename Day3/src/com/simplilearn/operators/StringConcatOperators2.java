package com.simplilearn.operators;

public class StringConcatOperators2 {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		int c = 30;
		
		String batch="SB010";
		
		System.out.println(a+b+c);//60 // int int int 
		System.out.println(a+batch);// int+String // 10SB010
		System.out.println(a+b+batch);// int + int + String = 30SB010
		
	}

}
