package com.simplilearn.hashset;

import java.util.HashSet;

public class HashSetLab7 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs= new HashSet<Integer>();
		
		hs.add(100);
		hs.add(130);
		hs.add(300);
		hs.add(120);
		hs.add(190);
		hs.add(500);
		
				
		System.out.println(hs); //[130, 100, 500, 120, 300, 190]
		
	}

}
