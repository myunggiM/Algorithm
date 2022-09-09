package dp_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 쉬운계단수_10844 {
	
	public static void main(String[] args) throws IOException {
		 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		 int n = Integer.parseInt(br.readLine());
		 final int MOD =1000000000;
		 long[][] dp =new long[n+1][10];

		 dp[1][0]=0L;
		 for (int i = 1; i < 10 ; i++) {
			 dp[1][i]=1L;
		 }
		 
		 for (int i = 2; i < n+1; i++) {
			//0으로 시작하는 개수 
			dp[i][0]=dp[i-1][1];
			for (int j = 1; j < 10; j++) {
				// 9일 경우 이전 자릿수의 8로 시작하는 수의 개수와 동일
				if(j==9) {
					dp[i][9]=dp[i-1][8];
				}
				dp[i][j]=(dp[i-1][j-1] % MOD +dp[i-1][j+1] % MOD) % MOD;
			}
		 }
		 
		 long ans = 0;
		 for (int i = 0; i < 10; i++) {
			 ans =(ans +dp[n][i])%MOD;
		}
		 System.out.println(ans);
		
	}

}
