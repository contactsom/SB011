package com.simplilearn.array;

public class ArrayExample10 {

	public static void main(String[] args) {
		
		// Anonymous Array
		sum(new int[] { 1, 2, 3, 4});
		
}
	
	public static void sum(int[] x) {
		int total=0;
		
		for(int a : x) {
			total=total+a;
		}
		
		System.out.println("The Sum IS : "+total);
	}

}