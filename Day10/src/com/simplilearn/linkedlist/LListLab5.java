package com.simplilearn.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LListLab5 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		for (int i = 1; i <= 20; i++) {
			
			ll.add(i);
		}
		
		//Cursor
		
		Iterator itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
