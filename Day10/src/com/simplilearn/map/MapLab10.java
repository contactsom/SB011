package com.simplilearn.map;

import java.util.HashMap;

public class MapLab10 {

	public static void main(String[] args) {
		
	
		
		
		HashMap hm = new HashMap();
		hm.put(1, "SEEMA");
		hm.put(2, "Rachna");
		hm.put(3, "Farhin");
		hm.put(4, "Ashwini");
		hm.put(5, "Tanu");
		hm.put(null, null);
		
		System.out.println(hm);
				/*{	
				{null=null, 1=SEEMA, 2=Rachna, 3=Farhin, 4=Ashwini, 5=Tanu}
				}*/
		
	}

}
