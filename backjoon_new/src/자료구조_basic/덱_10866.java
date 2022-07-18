package ÀÚ·á±¸Á¶_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class µ¦_10866 {
	static ArrayDeque<Integer> dq = new ArrayDeque<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine());
			int x;
			switch(st.nextToken()) {
				case "push_front":
					x=Integer.parseInt(st.nextToken());
					push_front(x);
					break;
				case "push_back":
					x=Integer.parseInt(st.nextToken());
					push_back(x);
					break;
				case "pop_front":
					sb.append(pop_front()+"\n");
					break;
				case "pop_back":
					sb.append(pop_back()+"\n");
					break;
				case "size":
					sb.append(size()+"\n");
					break;
				case "empty":
					sb.append(empty()+"\n");
					break;
				case "front":
					sb.append(front()+"\n");
					break;
				case "back":
					sb.append(back()+"\n");
					break;
			}
		}
		System.out.println(sb);
	}
	private static int back() {
		if(dq.isEmpty()) return -1;
		return dq.peekLast();
	}
	private static int front() {
		if(dq.isEmpty()) return -1;
		return dq.peekFirst();
	}
	private static int empty() {
		if(dq.isEmpty()) return 1;
		else return 0;
	}
	private static int size() {
		return dq.size();
	}
	public static void push_front(int x) {
		dq.addFirst(x);
	}
	public static void push_back(int x) {
		dq.addLast(x);
	}
	public static int pop_front() {
		if(dq.isEmpty()) return -1;
		return dq.pollFirst();
	}
	public static int pop_back() {
		if(dq.isEmpty()) return -1;
		return dq.pollLast();
	}

}
