package dp_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ÀÌÄ£¼ö_2193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        long dp[] =new long[n+1];
        dp[1]=1;
        dp[2]=1;
        for (int i = 3; i <= n; i++) {
			dp[i]= dp[i-1]+dp[i-2];
		}
        System.out.println(dp[n]);
	}

  
}
/*
 *  
 *  1 1
 *  1 10
 *  2 100 
 *    101  
 *  3 1000 1010 
 *         1001
 *  5 10000 10100 10010 
 *          10101 10001
 *  8 100000 101000 100100  100010 
 *           101010 100101  100001
 *   		 101001		
 */
