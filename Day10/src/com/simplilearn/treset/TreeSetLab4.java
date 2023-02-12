package com.simplilearn.treset;

import java.util.TreeSet;

public class TreeSetLab4 {

	public static void main(String[] args) {
	
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		treeset.add(null);
		System.out.println(treeset);
		
		
		// 1. in ascending order
		// 2. It does not accept null value
		// 3. From 1.7 onwards null is not at all accepted by TreeSet. 
			// If you enforce to add then we will get NullPointerException. 
			// Till 1.6 null was accepted only as the first element.
		
	}

}
