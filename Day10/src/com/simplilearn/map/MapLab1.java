package com.simplilearn.map;

import java.util.HashMap;

public class MapLab1 {

	public static void main(String[] args) {
		
		// Roll - Input- unique
		// Student Name - Output- May be may not be unique
		// Some DS
		// Key[Roll] - Value [Student Name]
		// Map[I]
		
		
		HashMap hm = new HashMap();
		hm.put(1, "SEEMA");
		hm.put(2, "Rachna");
		hm.put(3, "Farhin");
		hm.put(4, "Ashwini");
		hm.put(5, "Tanu");
		
		System.out.println(hm);
				/*{	
				1=SEEMA, 
				2=Rachna, 
				3=Farhin, 
				4=Ashwini, 
				5=Tanu
				}*/
		
	}

}
