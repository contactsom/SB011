package com.simplilearn.polymorphism1;

public class Customer {

	//Compile  Time or Method Overloading
	//Two method are said to be overloaded iff method names are same but arguments are different 
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		customer.buyPhone("Phone");
		customer.buyPhone("Phone","Charger");
		customer.buyPhone("Phone","Charger","Headphone");
		
		//customer.buyPhone(123);
	}
		
		public void buyPhone(String phone) {
			System.out.println("I got PHONE");
		}
		
		private int buyPhone(String phone,String Charger) {
			System.out.println("I got PHONE and CHARGER");
			return 1;
			
		}
		
		protected String buyPhone(String phone,String Charger,String headPhone) {
			System.out.println("I got PHONE and CHARGER AND HEADPHONE");
			return "";
		}
}
