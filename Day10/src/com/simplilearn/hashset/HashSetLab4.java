package com.simplilearn.hashset;

import java.util.HashSet;

public class HashSetLab4 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs= new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			
			hs.add(i);
		}
				
		System.out.println(hs); // [1, 2, 3, 4]
		
	}

}
