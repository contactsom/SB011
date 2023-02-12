package com.simplilearn.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LListLab8 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		for (int i = 1; i <= 5; i++) {
			
			ll.add(i);
		}
		
		//Cursor
		
		for (Integer l : ll) {
			System.out.println(l);
		}
		
		
		
	}
}
