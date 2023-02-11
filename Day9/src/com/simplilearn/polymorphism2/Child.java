package com.simplilearn.polymorphism2;

public class Child extends Parent {

	//overrides com.simplilearn.polymorphism2.Parent.getProperty
	public int getProperty()
	{
		System.out.println("Child + Parent Property ");
		return 200;
	}
	
}
