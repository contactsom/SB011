package com.simplilearn.switchcase;

public class Lab7 {

	public static void main(String[] args) {
		
		int balance = 4;// 4K
		
		switch(balance) {
		
			case 0:
				System.out.println("Your Account Balance is 0 ");
			case 1:
				System.out.println("Your Account Balance is 1 ");
			case 2:
				System.out.println("Your Account Balance is 2 ");
			case 3:
				System.out.println("Your Account Balance is 3 ");
			default:
				System.out.println("I am default balance");
			
		}

	}

}
