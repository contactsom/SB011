package com.simplilearn.interfaces2;

public class Path implements Left,Right {

	@Override
	public void getDirection(int a) {
	System.out.println("This direction is suggested by Right Interface");
		
	}

	@Override
	public void getDirection() {
		System.out.println("This direction is suggested by Left Interface");
	}

	

}


