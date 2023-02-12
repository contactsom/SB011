package com.simplilearn.hashset;

import java.util.HashSet;

public class HashSetLab3 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs= new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		
		System.out.println(hs); // [1, 2, 3, 4]
		
	}

}
