package com.simplilearn.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetLab2 {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs= new LinkedHashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			lhs.add(i);
		}
		
		Iterator itr= lhs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	
		

	}

}
