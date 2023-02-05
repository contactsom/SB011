package com.simpilearn.variableaccess1;

public class Simplilearn {

	public static void main(String[] args) {
		
		Learners learners = new Learners();
		String name=learners.name;
		System.out.println(name);
		
		
		String lname=Learners.name;
		System.out.println(lname);
		
		

	}

}
