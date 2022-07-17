package basic;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 소수구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(in.readLine());

		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		boolean[] isPrime = new boolean[n + 1];
		Arrays.fill(isPrime, true);

		isPrime[0] = isPrime[1] = false;

		for (int i = 2; i * i <= n; i++) {
			if (isPrime[i]) { // 중복제거 1번만 방문
				// 배수 방문
				for (int j = i + i; j <= n; j += i) {
					isPrime[j] = false;
				}
			}
		}
		for (int i = m; i <= n; i++) {
			if (isPrime[i])
				System.out.println(i);
		}
	}

}
