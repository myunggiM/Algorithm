package alwaysFormat;

import java.util.*;

public class ť {

	public static void main(String[] args) {
		LinkedList<Integer> q =new LinkedList<>(); // ť
		PriorityQueue<Integer> pq =new PriorityQueue<>(); //�켱���� ť ��������
		PriorityQueue<Integer> mpq = new PriorityQueue<>(Collections.reverseOrder()); //�켱���� ť ��������
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
		
		System.out.println("pq ���");
		while(!pq.isEmpty()) {
			int i = pq.poll();
			System.out.println(i);
		}
		
		System.out.println("mpq ���");
		while(!mpq.isEmpty()) {
			int i = mpq.poll();
			System.out.println(i);
		}
		
	}

}
