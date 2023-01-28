package com.simplilearn.foreachloop;

public class Lab4 {

	public static void main(String[] args) {
		
		int[] rollNumbers = {90,34,54,23,67,65};
		
		
		for(int rollNumber: rollNumbers) {
			
			// get the only even roll number==90,34,54
			// rollNumber % 2 ==0 - to check the even
			
			if(rollNumber%2==0) {
				
				System.out.println(rollNumber);
			}
			
			
		}
		
		
	}

}