package com.simplilearn.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorLab4 {

	public static void main(String[] args) {
		
		
		Vector v = new Vector();
		
		// Add the element
		
		for (int i = 1; i <=11; i++) {
			
			v.addElement(i);
		}
		
		// Enumeration (1.0V)
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
	}
}
