package com.simplilearn.polymorphism2;

public class Advocate {

	public static void main(String[] args) {
		
		
		Parent parent = new Parent();
		parent.getProperty(); // The method getProperty() from the type Parent is not visible
		
		
		Child child = new Child();
		child.getProperty();
		
		//Parent parent1 = new Child();
		//parent1.getProperty();
	}

}
