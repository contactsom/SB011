package com.simplilearn.thread;

public class ThreadLab4 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("ThreadLab4 -main ");
		System.out.println(Thread.currentThread().getName());
		
	}

}
