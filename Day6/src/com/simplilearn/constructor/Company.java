package com.simplilearn.constructor;

public class Company {

	public static void main(String[] args) {
		
		// Company is asking about Employee details
		// 1. We need to create the Object 
		
		Employee employee = new Employee();// Creating the Object of Employee Class, where object name is "employee"
		
		// Behind the seen 
		// 1. Employee class is getting loaded 
		// 2. Constructor call will happen
			// From Where ?
		// 2.1. From Employee class
		// 3. The object employee allocated in to memory
		// 4. Object got all the information about Employee class
		
		int age=employee.employeeAge;
		int id=employee.employeeID;
		String name=employee.employeeName;
		employee.getEmployeeDetails();
		
		
		Employee employee1 = new Employee( "abc",  23, 1234);
		
	}
}
