package com.simplilearn.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListLab8 {

	public static void main(String[] args) {
		
		// This array List holds only integer data only
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
	
		// Cursor.. 
		// By using Iterator
	
		Iterator itr=arrayList.iterator();
		
		// hasNext  : If element is exist then only move forward else stop while loop
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
