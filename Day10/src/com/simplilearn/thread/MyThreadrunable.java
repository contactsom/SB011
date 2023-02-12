package com.simplilearn.thread;

//2. Implementing the Runnable Interface(*)

public class MyThreadrunable implements Runnable {

	@Override
	public void run() {
	
		for (int i = 0; i < 10; i++) {
			System.out.println(" Child Thread");
		}
		
	}


}
