package com.simplilearn.thread;

import java.util.Iterator;

public class ThreadLab3 {

	public static void main(String[] args) {
		
		MyThreadrunable myThreadrunable = new MyThreadrunable();
		
		Thread t = new Thread(myThreadrunable);// take my thread
		t.start(); // and then start
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("I am parent Thread");
		}
	}

}
