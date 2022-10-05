/**
 * 
 */
package com.cogent.queue;

import java.util.PriorityQueue;

/**
 * @author dick
 *
 *         5 окт. 2022 г.
 */
public class MainQue1 {

	/**
	 * Create a PriorityQueue and insert integer values and perform some predefined
	 * function like add(), peek(), offer() ... etc
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.add(111);
		pq.add(112);
		pq.add(113);
		pq.add(114);
		pq.add(115);

		System.out.println("\t" + pq + "\tSIZE\t" + pq.size());
		pq.clear();
		System.out.println("\t" + pq + "\tSIZE\t" + pq.size());

		pq.add(211);
		pq.add(212);
		pq.add(213);
		pq.add(214);
		pq.add(215);
		pq.add(216);
		pq.add(217);
		pq.add(218);

		System.out.println("\t" + pq + "\tSIZE\t" + pq.size());
		System.out.println("\t" + pq + "\tPEEK\t" + pq.peek());
		pq.offer(219);
		
		System.out.println("\t" + pq + "\tPEEK\t" + pq.peek());
		System.out.println("\t" + pq + "\tPOLL\t" + pq.poll());
		System.out.println("\t" + pq + "\tPOLL\t" + pq.poll());
		System.out.println("\t" + pq + "\tPOLL\t" + pq.poll());
		
	}

}
