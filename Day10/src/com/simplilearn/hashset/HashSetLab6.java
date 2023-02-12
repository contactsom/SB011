package com.simplilearn.hashset;

import java.util.HashSet;

public class HashSetLab6 {

	public static void main(String[] args) {
		
		HashSet<String> hs= new HashSet<String>();
		
		hs.add("A");
		hs.add("B");
		hs.add("M");
		hs.add("D");
		hs.add("N");
		//hs.add(1);
				
		System.out.println(hs); //[A, B, C, D, E]
		
	}

}
