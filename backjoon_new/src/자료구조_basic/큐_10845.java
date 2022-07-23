package 자료구조_basic;

import java.io.*;
import java.util.*;
public class 큐_10845 {
	static ArrayDeque<Integer> q = new ArrayDeque<Integer>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		int N= Integer.parseInt(in.readLine());
		StringTokenizer st; 
		for (int i = 0; i < N; i++) {
			st =new StringTokenizer(in.readLine());
			String str = st.nextToken();
			int x;
			switch(str) {
				case "push":
					x = Integer.parseInt(st.nextToken());
					q.add(x);
					break;
				case "pop":
					if(q.peek() == null) sb.append("-1\n");
					else sb.append(q.poll()+"\n");
					break;
				case "size":
					sb.append(q.size()+"\n"); 
					break;
				case "empty":
					if(q.isEmpty()) sb.append("1\n");
					else sb.append("0\n");
					break;
				case "front":
					if(q.isEmpty()) sb.append("-1\n");
					else sb.append(q.peek()+"\n");
					break;
				case "back":
					if(q.isEmpty()) sb.append("-1\n");
					else sb.append(q.getLast()+"\n");
					break;
			}
			
		}
		System.out.println(sb);
	}

}
