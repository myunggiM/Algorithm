package 수학1_basic;

import java.io.*;
import java.util.*;

public class 조합_2004 {

	public static void main(String[] args) throws IOException {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(in.readLine());
		
		long n =Long.parseLong(st.nextToken());
		long m =Long.parseLong(st.nextToken());
		
		// n! / m! (n-m)! 
		int value5=countZero(n,5)-countZero(m,5)-countZero(n-m,5);
		int value2=countZero(n,2)-countZero(m,2)-countZero(n-m,2);
		System.out.println(min(value5,value2));
		
	}
	 
	private static int countZero(long n,int number) {
		int cnt=0;
		while(n>=number){
			cnt+=n/number;
			n/=number;
		}
		return cnt;
	}
	private static int min(int a,int b) {
		return a<=b ? a:b;
	}
		 
	
	
}
