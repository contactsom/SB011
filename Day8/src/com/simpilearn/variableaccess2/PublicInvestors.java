package com.simpilearn.variableaccess2;

import com.simpilearn.variableaccess1.Relianse;

public class PublicInvestors {

	public static void main(String[] args) {
		
		Relianse relianse = new Relianse();
		
		int sprice=relianse.stockPrice;
		System.out.println(sprice);

	}

}
