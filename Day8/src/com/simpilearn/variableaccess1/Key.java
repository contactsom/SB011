package com.simpilearn.variableaccess1;

public class Key {

	public static void main(String[] args) {
	 
		Locker locaker = new Locker();
		String mykey=locaker.key;//The field Locker.key is not visible

		System.out.println(mykey);
	}

}
