package com.simplilearn.constructor;

public class Employee {

	String employeeName;
	int employeeAge;
	int employeeID;
	
	
	public void getEmployeeDetails() {
		System.out.println("My name is : Surya, Id is : 123 and AGE IS : 23");
	}


	public Employee() {
		super();
		
	}
	
	public Employee(String employeeName, int employeeAge, int employeeID) {
		super();
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeID = employeeID;
	}


	
	
	// Constructor is here 
	
}

