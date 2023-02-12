package com.simplilearn.map;

import java.util.HashMap;

public class MapLab3 {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "SEEMA");
		hm.put(2, "Rachna");
		hm.put(3, "Farhin");
		hm.put(4, "Ashwini");
		hm.put(5, "Tanu");
		hm.put(1, "SEEMA NEW");
		
		
		System.out.println(hm);
		//{1=SEEMA,     2=Rachna, 3=Farhin, 4=Ashwini, 5=Tanu}
		//{1=SEEMA NEW, 2=Rachna, 3=Farhin, 4=Ashwini, 5=Tanu}
				
		
	}

}
