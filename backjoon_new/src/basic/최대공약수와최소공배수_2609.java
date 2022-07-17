package basic;

import java.io.*;
import java.util.*;

public class 최대공약수와최소공배수_2609 {

	public static void main(String[] args) throws IOException {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(in.readLine());
		
		int a =Integer.parseInt(st.nextToken());
		int b =Integer.parseInt(st.nextToken());
		int n = a;
		int m = b;
		while(true) {
			int r= a%b;
			a=b;
			b=r;
			if(r==0) {
				break;
			}
		}
		b = n*m/a;
		System.out.println(a);
		System.out.println(b);
	}

}
