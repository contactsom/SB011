package com.simplilearn.typecasting;

public class ExplicitTypeCastingExample {

	public static void main(String[] args) {
		
		short s=32767;
		System.out.println("SHORT - "+s);
		
		byte b=(byte) s;
		System.out.println("BYTE - "+b);
		
		System.out.println("*********************");
		
		
		//byte b1 = 130; // Type mismatch: cannot convert from int to byte
		byte b2 = (byte)130;
		System.out.println("Byte - "+b2);
		
		
	}
}
