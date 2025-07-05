package java4;

import java.util.PriorityQueue;

public class que {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(1 );
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(60);

		//peak
		System.out.println(pq.peek());
		System.out.println(pq);
		
		//element
		System.out.println(pq.element());
		System.out.println(pq);
		
		//poll
		System.out.println(pq.poll());
		System.out.println(pq);
		
		//remove
		System.out.println(pq.remove());
		System.out.println(pq);
		

	}

}
