package dp_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class µ¿¹°¿ø {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	// dp[1][0]=1 , dp[1][1]=1, dp[1][2]=1
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		 int n = Integer.parseInt(br.readLine());
		 final int MOD =9901;
		 long dp[][] =new long[n+1][3];
		 dp[1][0]=dp[1][1]=dp[1][2]=1;
		 for (int i = 2; i < dp.length; i++) {
			 dp[i][0]=(dp[i-1][0]+dp[i-1][1]+dp[i-1][2]) % MOD ;
			 dp[i][1]=(dp[i-1][0]+dp[i-1][2]) % MOD;
			 dp[i][2]=(dp[i-1][0]+dp[i-1][1]) % MOD;
		}
		long ans = (dp[n][0]+dp[n][1]+dp[n][2]) % MOD;
		System.out.println(ans);
	}

}
