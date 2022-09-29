/**
 * 
 */
package com.cogent.fifo;

/**
 * @author dick
 *
 *         29 сент. 2022 г.
 */
public class QueueImpl {

	int getNext() {
		
		return 0;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int front = 0;
		int rear = 0;
		int[] q = new int[256];

		q[front] = 1;
		front++;

		q[front] = 2;
		front++;

		q[front] = 3;
		front++;

		q[front] = 4;
		front++;

		q[front] = 5;
		front++;

		q[front] = 6;
		front++;

		for (int i = 0; i < front; i++)
			System.out.print(q[i] + " ");
		System.out.println();

	}

}
