package com.simplilearn.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapLab9 {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "SEEMA");
		hm.put(2, "Rachna");
		hm.put(3, "Farhin");
		hm.put(4, "Ashwini");
		hm.put(5, "Tanu");
		
		Set keys=hm.keySet();
		Iterator itr=keys.iterator();
		
		while(itr.hasNext()) {
			int key= (int) itr.next();
			String value = hm.get(key);
			
			System.out.println(value);//
			
			
		}
		
		
		
	}

}
