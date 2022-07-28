package dp_basic;
import java.io.*;
public class 일이삼더하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int dp[]= new int[11];
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		for (int i = 0; i < n; i++) {
			int m= Integer.parseInt(br.readLine());
			if(dp[m]!=0) {
				System.out.println(dp[m]);
				continue;
			}
			for (int j = 4; j <= m; j++) {
				dp[j]=dp[j-1]+dp[j-2]+dp[j-3];
			}
			System.out.println(dp[m]);
		}
		
	}


}
