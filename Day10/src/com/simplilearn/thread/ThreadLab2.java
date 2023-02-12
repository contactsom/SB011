package com.simplilearn.thread;

public class ThreadLab2 {

	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.start();// start the thread
		
		for (int i = 0; i < 10; i++) {
			System.out.println("I am Parent Thread");
		}

	}

}
