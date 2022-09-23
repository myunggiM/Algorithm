package alwaysFormat;

import java.util.*;

public class 큐 {

	public static void main(String[] args) {
		LinkedList<Integer> q =new LinkedList<>(); // 큐
		PriorityQueue<Integer> pq =new PriorityQueue<>(); //우선순위 큐 오름차순
		PriorityQueue<Integer> mpq = new PriorityQueue<>(Collections.reverseOrder()); //우선순위 큐 내림차순
		q.add(1);
		q.poll();
		q.size();
		q.isEmpty();
		q.peek(); //front
		q.peekLast(); //back
		
		pq.poll();
		pq.clear(); //clear
		
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		
		mpq.add(1);
		mpq.add(2);
		mpq.add(3);
		mpq.add(4);
		
		System.out.println("pq 출력");
		while(!pq.isEmpty()) {
			int i = pq.poll();
			System.out.println(i);
		}
		
		System.out.println("mpq 출력");
		while(!mpq.isEmpty()) {
			int i = mpq.poll();
			System.out.println(i);
		}
		
	}

}
