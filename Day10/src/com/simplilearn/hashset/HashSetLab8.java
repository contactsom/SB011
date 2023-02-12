package com.simplilearn.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetLab8 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs= new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			
			hs.add(i);
		}
				
		// Cursor - iterator
		
		Iterator itr= hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
