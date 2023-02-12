package com.simplilearn.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueLab5 {

	// FIFO
	// 
	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();

		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		
		System.out.println("Before Delete--");
		Iterator itr = pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		pq.poll();
				
		System.out.println("After Delete--");
		Iterator itr1 = pq.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}	

	}

}
