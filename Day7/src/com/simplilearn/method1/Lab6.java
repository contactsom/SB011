package com.simplilearn.method1;

public class Lab6 {

	public static void main(String[] args) {
		
		System.out.println("***** Start - Lab6 *****");
		
		Lab6 lab5 = new Lab6();
		
		String acceptwish=lab5.greetings("Good Morning");
		System.out.println(acceptwish);
		
		System.out.println("***** End - Lab6 *****");
		

	}

	
	public String greetings(String wish) {
		
		String mywish="Hi All : " + wish;
		 
		return mywish;
		
	}
	
	
	
	
}
