package com.simplilearn.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LListLab6 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		for (int i = 1; i <= 20; i++) {
			
			ll.add(i);
		}
		
		//Cursor
		
		//Iterator itr=ll.listIterator();
		ListIterator itr=ll.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
