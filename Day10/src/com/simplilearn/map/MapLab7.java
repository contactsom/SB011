package com.simplilearn.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapLab7 {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "SEEMA");
		hm.put(2, "Rachna");
		hm.put(3, "Farhin");
		hm.put(4, "Ashwini");
		hm.put(5, "Tanu");
		
		Set s1=hm.entrySet();
		
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			//itr.next();
			System.out.println(itr.next());
			
		}
		
		
		
	}

}
