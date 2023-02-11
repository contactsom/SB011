package com.simplilearn.list;

import java.util.ArrayList;

public class ListLab7 {

	public static void main(String[] args) {
		
		// This array List holds only integer data only
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
	
		
		for (Integer al : arrayList) {
			System.out.println(al);
		}

	}

}
