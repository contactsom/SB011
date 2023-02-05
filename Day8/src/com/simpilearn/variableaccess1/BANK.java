package com.simpilearn.variableaccess1;

public class BANK {

	public static void main(String[] args) {
		
		ATM atm = new ATM();
		
		int cardNo=atm.atmCardNumber;
		
		System.out.println("Before Change : "+cardNo);//8575
		
		cardNo=999;
		
		System.out.println("After Change : "+cardNo);//
		
		
		//atm.atmCardNumber = 8547;
		
		System.out.println(" atm.atmCardNumber : "+atm.atmCardNumber);
		
	 // The final field ATM.atmCardNumber cannot be assigned
		
		
		//sir can we write atm.atmCaedNumber=8765

	}

}
