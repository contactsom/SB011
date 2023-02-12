package com.simplilearn.queue;

import java.util.PriorityQueue;

public class PriorityQueueLab3 {

	// FIFO
	// 
	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		
		// null value
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		//pq.add(null);
		
		System.out.println(pq);
				

	}

}
