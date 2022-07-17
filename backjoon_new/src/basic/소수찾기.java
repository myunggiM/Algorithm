package basic;

import java.io.*;
import java.util.*;

public class �Ҽ�ã�� {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		StringTokenizer st = new StringTokenizer(in.readLine());
		boolean isPrime[] =new boolean[1001];
		Arrays.fill(isPrime,true);
		isPrime[1]=false;
		
		//��� ����  false ó��
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
			//  �Ҽ� ã�� 
			if(isPrime[a]) {
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
