package 자료구조_basic;

import java.io.*;
import java.util.*;

public class 요세푸스_1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(in.readLine());
		StringBuilder sb= new StringBuilder();
		int N =Integer.parseInt(st.nextToken());
		int K =Integer.parseInt(st.nextToken());
		int p=0; //현재 위치 
		int outp=0; //결과배열 위치 
		List<Integer> list =new ArrayList<>();
		
		int idx =-1;
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}
		sb.append("<");
		while(!list.isEmpty()){
			idx= (idx+K)%list.size();
			sb.append(list.get(idx)+", ");
			list.remove(idx--);
		}
		sb.setLength(sb.length()-2);
		sb.append(">");
		System.out.println(sb);
	}
	
}
/*
 * print 보단 StringBuilder 사용 
 * array 보단 ArrayList 가 더 깖끔
 * 
 */

 
