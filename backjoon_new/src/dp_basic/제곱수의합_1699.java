package dp_basic;

import java.util.*;
import java.math.*;
public class ����������_1699 {
	
	static int dp[] ;
	
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		dp = new int[100001];
		dp[1] =1;
		
		for(int i=2;i<=n;i++) {	 // dp 2���� ä��� ����
			dp[i]=i; //�켱 �ڱ��ڽ����� �ʱ�ȭ �صд�.
			for(int j=1;j*j<=i;j++) { // j�� 1���� ���� ���� i���� ���� ��� �ݺ��Ѵ�.								
				dp[i] = Math.min(dp[i-(j*j)]+1,dp[i]); // �ּ����� ������ ã�� ���ؼ� ���� �� ���� ��ȭ�İ��� ���Ͽ� �ּڰ��� ���Ѵ�.		
			}
		}
		
		System.out.println(dp[n]);
			
	}
	
}