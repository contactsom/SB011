package com.simplilearn.vector;

import java.util.Vector;

public class VectorLab2 {

	public static void main(String[] args) {
		
		
		Vector v = new Vector();
		
		System.out.println(v.capacity());
		// Add the element
		
		for (int i = 1; i <=11; i++) {
			
			v.addElement(i);
		}
		
		System.out.println(v);
		
		System.out.println(v.capacity());
		
		
	}
}
