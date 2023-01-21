package com.simplilearn.operators;

public class BitwiseOperatorExample {

	public static void main(String[] args) {
		
		//https://www.rapidtables.com/convert/number/decimal-to-binary.html
		
		// ~ = tilde
		
		// Complement of 4
		
		System.out.println(~1); // -2
		
		System.out.println(~4); // -5
		// 0000000000000100 = 4
		// 0000000000000101 = 5
		
		
		// tilde operator will not work for boolean type
		
		//System.out.println(~true);//The operator ~ is undefined for the argument type(s) boolean
	}

}
