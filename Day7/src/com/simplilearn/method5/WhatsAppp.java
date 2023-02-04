package com.simplilearn.method5;

import com.simplilearn.method4.WhatsApppWebFirefox;

public class WhatsAppp extends WhatsApppWebFirefox{

	public static void main(String[] args) {
		
	
		// how to send the messages ?
		// By creating the parent class Object i.e WhatsApppWebFirefox
		// By Creating the Child class object i.e WhatsAppp - True
		
		// sendMessagesFromFirefox() is present in which class 
			// WhatsApppWebFirefox - parent Class
		
		WhatsApppWebFirefox whatsApppWebFirefox = new WhatsApppWebFirefox();
		WhatsAppp whatsAppp = new WhatsAppp();
		
		//whatsApppWebFirefox.sendMessagesFromFirefox();
		//The method sendMessagesFromWeb() from the type WhatsApppWebFirefox is not visible
		
		whatsAppp.sendMessagesFromFirefox();
		
		// You can call the parent class method by creating the child class object only .
		// Also make sure parent and child class are exist in to different package not is same package.
	}
}
