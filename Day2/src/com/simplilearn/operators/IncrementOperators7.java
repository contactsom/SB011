package com.simplilearn.operators;

public class IncrementOperators7 {

	public static void main(String[] args) {
	
	//First : Difference between b++ and b+1 
		
	int a = 30;
	int b = a++;
	System.out.println(a);// 31
	System.out.println(b);// 30
	
	System.out.println("***********************");
	
	int x = 30;
	int y = x + 1; //
	System.out.println(x);//  Output : 30
	System.out.println(y);//  Output : 31
	
	// There is a difference between x++ and x + 1 . Agree ?
	
	// ++ x  : First Increment then assign 
	// x ++  : First Assign then increment
	// x + 1 : Only increment
	
	
	
	
	}

}
