package 수학1_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 팩토리얼 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n =Integer.parseInt(in.readLine());
		System.out.println(fact(n));
		
	}
	static int fact(int n) {
		if(n==0) return 1;
		return n*fact(n-1);
	}

}
