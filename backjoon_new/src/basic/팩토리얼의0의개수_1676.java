package basic;

import java.io.*;

public class ���丮����0�ǰ���_1676 {
	static int list[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(in.readLine());
		// n! 
		int cnt=0;  
		while(n>=5) {
			cnt +=n/5; //5�� ����
			n/=5;
		}
		
		System.out.println(cnt);
	}


}
