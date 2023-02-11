package com.simplilearn.list;

import java.util.ArrayList;

public class ListLab6 {

	public static void main(String[] args) {
		
		// This array List holds only integer data only
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
	
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.get(0));// get me the element from index Zero (0)
		System.out.println(arrayList.get(1));// get me the element from index Zero (1)
		System.out.println(arrayList.get(2));// get me the element from index Zero (2)
		System.out.println(arrayList.get(3));// get me the element from index Zero (3)
		//System.out.println(arrayList.get(4));// java.lang.IndexOutOfBoundsException

	}

}
