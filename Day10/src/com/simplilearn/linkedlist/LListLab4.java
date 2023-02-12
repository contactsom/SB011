package com.simplilearn.linkedlist;

import java.util.LinkedList;

public class LListLab4 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		for (int i = 1; i <= 20; i++) {
			
			ll.add(i);
		}
		
		
		System.out.println("Before Add First Element : "+ll);
		
		ll.addFirst(100);
		
		System.out.println("After Add First Element : "+ll);
		
		
	}
}
