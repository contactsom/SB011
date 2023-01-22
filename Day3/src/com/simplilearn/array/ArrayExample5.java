package com.simplilearn.array;

public class ArrayExample5 {

	public static void main(String[] args) {
		
		// Array Construction:
		
		int[] a = {2,5,3,8,9,6,7,34,29};//Decleare the Array having value i.e static array wrt value
	
		int[] b = new int[5];// 10 // Creating the array
			b[0]=3;
			System.out.println("From array b at index 0 : "+b[0]);
			b[1]=5;
			System.out.println("From array b at index 1 : "+b[1]);
			b[2]=8;
			System.out.println("From array b at index 2 : "+b[2]);
			b[3]=9;
			System.out.println("From array b at index 3 : "+b[3]);
			b[4]=7;
			System.out.println("From array b at index 4 : "+b[4]);
			
			//***************************************************
			b[5]=14;
			System.out.println("From array b at index 4 : "+b[5]);
			
			// b[5]= It must have at least 6 element in array
			// Given : b[5] is the last index of array
			// Ask: Size of the array must 6
			
			
		
}

}