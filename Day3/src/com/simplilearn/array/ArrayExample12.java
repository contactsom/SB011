package com.simplilearn.array;

public class ArrayExample12 {

	public static void main(String[] args) {
		
		// Array Operation:
		// Insert 
		
		int[] a = new int[6];
			// Insert
			a[0]=9;
			a[1]=8;
			a[2]=7;
			a[3]=6;
			a[4]=5;
			a[5]=4;
		
		//Display
		System.out.println("***** Before Update ******");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		
		// Update
		a[0]=90;
		a[1]=80;
		a[2]=70;
		a[3]=60;
		a[4]=50;
		a[5]=40;
		
		System.out.println("***** After Update ******");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		
}
	

}