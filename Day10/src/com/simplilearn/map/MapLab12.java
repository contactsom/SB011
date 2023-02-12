package com.simplilearn.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapLab12 {

	public static void main(String[] args) {
		//if we want only 3 and Farhin then is there a way to get it directly rather than iterating
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "SEEMA");
		hm.put(2, "Rachna");
		hm.put(3, "Farhin");//this record
		hm.put(4, "Ashwini");
		hm.put(5, "Tanu");
		
		Set keys=hm.keySet();
		Iterator itr=keys.iterator();
		
		while(itr.hasNext()) {
			int key= (int) itr.next();
			String value = hm.get(key);
			
			if(key==3) {
				System.out.println("KEY : "+key+" VALUE : "+value);//
			}
		}
		
		
		
		
	}

}
