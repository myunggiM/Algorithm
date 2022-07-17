package basic;

import java.io.*;
import java.util.*;

public class 소수찾기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		StringTokenizer st = new StringTokenizer(in.readLine());
		boolean isPrime[] =new boolean[1001];
		Arrays.fill(isPrime,true);
		isPrime[1]=false;
		
		//배수 제거  false 처리
		for (int i = 2; i*i < isPrime.length; i++) {
			if (isPrime[i]) {
				for (int j = i*2; j < isPrime.length; j+=i) {
					isPrime[j]=false;
				}
			}
		}
		int count=0;
		while(st.hasMoreTokens()) {
			int a = Integer.parseInt(st.nextToken());
			//  소수 찾기 
			if(isPrime[a]) {
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
