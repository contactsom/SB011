package com.simplilearn.linkedlist;

import java.util.LinkedList;

public class LListLab2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		for (int i = 1; i <= 20; i++) {
			
			ll.add(i);
		}
		
		
		System.out.println(ll);
	}
}
