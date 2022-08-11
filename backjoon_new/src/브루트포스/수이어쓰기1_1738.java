package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수이어쓰기1_1738 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int n = Integer.parseInt(s);
		int ans =0;
		int step=1; 
		for (int i = 0; i < s.length(); i++) {
			ans +=step*(n-(Math.pow(10,i)) +1);
		}
		System.out.println(ans);
		
		
	}

}
