package com.simplilearn.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapLab13 {

	public static void main(String[] args) {
		//if we want only 3 and Farhin then is there a way to get it directly rather than iterating
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "SEEMA");
		hm.put(2, "Rachna");
		hm.put(3, "Farhin");//this record
		hm.put(4, "Ashwini");
		hm.put(5, "Tanu");
		
		
		String name=hm.get(3);
		System.out.println(name);
		
		
		
		
		
	}

}
