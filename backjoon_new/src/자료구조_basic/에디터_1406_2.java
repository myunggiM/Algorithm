package 자료구조_basic;
import java.io.*;
import java.util.*;

public class 에디터_1406_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int M = Integer.parseInt(br.readLine());
		
		LinkedList<Character> list =new LinkedList<>();
		
		for (int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}
		ListIterator<Character> iter =list.listIterator();
		
		//iter 끝으로 이동
		while(iter.hasNext()) {
			iter.next();
		}
		
		for(int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "L":
				if (iter.hasPrevious()) {
					iter.previous();
				}
				break;
			case "D":
				if(iter.hasNext()) {
					iter.next();
				}
				break;
			case "B":
				if (iter.hasPrevious()) {
					iter.previous();
					iter.remove();
				}
				break;
			case "P":
				String s =st.nextToken();
				iter.add(s.charAt(0));
				break;
			default:
				break;
			}
		}
		for (Character character : list) {
			bw.write(character);
		}
		bw.flush();
		bw.close();
		
	}
}
