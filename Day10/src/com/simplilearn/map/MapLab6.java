package com.simplilearn.map;

import java.util.Collection;
import java.util.HashMap;

public class MapLab6 {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "SEEMA");
		hm.put(2, "Rachna");
		hm.put(3, "Farhin");
		hm.put(4, "Ashwini");
		hm.put(5, "Tanu");
		
		// Get all the Values's
		Collection values=hm.values();
		
		System.out.println(values);//[SEEMA, Rachna, Farhin, Ashwini, Tanu]
	
		
	}

}
