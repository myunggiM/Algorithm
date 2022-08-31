package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M4 {
	static int N;
	static int M;
	static int [] arr;
	public static void main(String[] args) throws IOException {
			 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			 StringTokenizer st = new StringTokenizer(br.readLine());
			 N = Integer.parseInt(st.nextToken());
			 M = Integer.parseInt(st.nextToken());
			 arr =new int[M];
			 for (int i = 1; i <= N; i++) {
				 arr[0]=i;
				 dfs(i,1);
			}
			 
	}
	private static void dfs(int p, int m) {
		if (m==M) {
			for (int i = 0; i < arr.length-1; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println(arr[M-1]);
			return;
		}
		
		for (int i = 1; i <=N ; i++) {
			if(p<= i) {
				arr[m]=i;
				dfs(i,m+1);
			}
		}
	}

}
