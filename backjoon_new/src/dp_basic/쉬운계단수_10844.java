package dp_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �����ܼ�_10844 {
	
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
			//0���� �����ϴ� ���� 
			dp[i][0]=dp[i-1][1];
			for (int j = 1; j < 10; j++) {
				// 9�� ��� ���� �ڸ����� 8�� �����ϴ� ���� ������ ����
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
