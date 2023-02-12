package com.simplilearn.map;

import java.util.HashMap;
import java.util.Set;

public class MapLab5 {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "SEEMA");
		hm.put(2, "Rachna");
		hm.put(3, "Farhin");
		hm.put(4, "Ashwini");
		hm.put(5, "Tanu");
		
		// Get all the Key's 
		Set keys= hm.keySet();
		
		System.out.println(keys);//[1, 2, 3, 4, 5]
	
		
	}

}
