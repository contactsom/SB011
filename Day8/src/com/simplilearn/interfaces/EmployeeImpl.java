package com.simplilearn.interfaces;

public class EmployeeImpl extends City implements Employee , Department , Company{

	@Override
	public void getCourseName() {
		System.out.println("I am from class EmployeeImpl : getCourseName ");
		
	}

	@Override
	public void getEmployeeName() {
		System.out.println("I am from class EmployeeImpl : getEmployeeName ");
		
	}

	@Override
	public void getEmployeeAge() {
		System.out.println("I am from class EmployeeImpl : getEmployeeAge ");
		
	}

	@Override
	public void getEmployeeSalery() {
		System.out.println("I am from class EmployeeImpl : getEmployeeSalery ");
		
	}

	@Override
	public void getDepartment() {
		System.out.println("I am from class EmployeeImpl,Department[I]  : getDepartment ");
		
	}

	@Override
	public void getComapnyDetails() {
		System.out.println("I am from class EmployeeImpl,Company[I]  : getComapnyDetails ");
		
	}

	@Override
	public void getEmployeeCity() {
		System.out.println("I am from class EmployeeImpl,City[C]  : getEmployeeCity ");
		
	}
	
	

}

