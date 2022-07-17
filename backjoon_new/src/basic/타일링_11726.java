package basic;

import java.io.*;

public class 타일링_11726 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(in.readLine());
        int dp[] =new int[1001];
        dp[0]=1;
        dp[1]=2; 
        for (int i = 2; i < N; i++) {
            dp[i] = (dp[i-1]+dp[i-2])%10007;
        }
        System.out.println(dp[N-1]);
    }
}