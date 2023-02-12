package com.simplilearn.treset;

import java.util.TreeSet;

public class TreeSetLab3 {

	public static void main(String[] args) {
	
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		
		treeset.add(99);
		treeset.add(4);
		treeset.add(3);
		treeset.add(1);
		treeset.add(2);
		treeset.add(4);
		treeset.add(4);
		treeset.add(100);
		//treeset.add(null);
		//treeset.add(null);
		
		System.out.println(treeset);
		// 1. in ascending order
		//  2. It does not accept null value
	}

}
