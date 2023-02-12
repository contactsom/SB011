package com.simplilearn.map;

import java.util.HashMap;

public class MapLab4 {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "SEEMA");
		hm.put(2, "Rachna");
		hm.put(3, "Farhin");
		hm.put(4, "Ashwini");
		hm.put(5, "Tanu");
		
		hm.put(1, "SEEMA - NEW");
		hm.put(2, "Rachna - NEW");
		hm.put(3, "Farhin - NEW");
		hm.put(4, "Ashwini - NEW");
		hm.put(5, "Tanu - NEW");
		
		System.out.println(hm);
		
		/*{	
			1=SEEMA - NEW, 
			2=Rachna - NEW, 
			3=Farhin - NEW, 
			4=Ashwini - NEW,
			5=Tanu - NEW
			}*/
	
		
	}

}
