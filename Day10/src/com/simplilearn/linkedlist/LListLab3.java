package com.simplilearn.linkedlist;

import java.util.LinkedList;

public class LListLab3 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		for (int i = 1; i <= 20; i++) {
			
			ll.add(i);
		}
		
		
		System.out.println("Before Remove last Element : "+ll);
		ll.removeLast();
		System.out.println("After Remove last Element : "+ll);
		
	}
}
