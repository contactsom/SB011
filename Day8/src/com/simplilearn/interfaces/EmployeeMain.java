package com.simplilearn.interfaces;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		EmployeeImpl employeeImpl = new EmployeeImpl();
		employeeImpl.getCourseName();
		employeeImpl.getEmployeeAge();
		employeeImpl.getEmployeeName();
		employeeImpl.getEmployeeSalery();
		employeeImpl.getDepartment();
		employeeImpl.getComapnyDetails();
		employeeImpl.getEmployeeCity();
		
		
		String comName=Company.companynaem;
		System.out.println(comName);

	}

}
