package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class 날짜계산_1476 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int E= Integer.parseInt(st.nextToken());
		int S= Integer.parseInt(st.nextToken());
		int M= Integer.parseInt(st.nextToken());
		
		int e=1;
		int s=1;
		int m=1;
		
		int y=1;
		while(true) {
			if (e==E && s==S && m==M) {
				System.out.println(y);
				break;
			}
			y++;
			e++;
			s++;
			m++;
			if(e==16) {
				e=1;
			}
			if(s==29) {
				s=1;
			}
			if(m==20) {
				m=1;
			}
		}
		
	}

}
