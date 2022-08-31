package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 부등호_2529 {
	static int k;
	static int num[]; 
	static String ch[]; 
	static long MAX =Long.MIN_VALUE;
	static long MIN =Long.MAX_VALUE;
	static String max=new String();
	static String min=new String();
	static boolean v[] =new boolean[10];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		k =Integer.parseInt(br.readLine());
		num =new int[k+1];
		ch= br.readLine().split(" ");
		//dfs
		for (int i = 0; i < 10; i++) {
			num[0]=i;
			v[i]=true;
			dfs(1,i);
			v[i]=false;
		}
		System.out.println(max);
		System.out.println(min);
	}
	private static void dfs(int val, int i) {
		// 최대최소 비교
		if(val ==k+1) {
			String str = Arrays.toString(num).replaceAll("[^0-9]","");
			long n = Long.parseLong(str);
			long tempMAX =MAX;
			long tempMIN =MIN;
			MAX =Math.max(MAX, n);
			MIN =Math.min(MIN, n);
			if(MAX != tempMAX) max =Arrays.toString(num).replaceAll("[^0-9]","");
			if(MIN != tempMIN) min =Arrays.toString(num).replaceAll("[^0-9]","");
			return;
		}
		// 조건부합시 dfs 타기
		for (int j = 0; j < 10; j++) {
			if (v[j]) continue;		
			if ((ch[val-1].equals("<") && i < j) || (ch[val-1].equals(">") && i > j)) {
				num[val] =j;
				v[j]=true;
				dfs(val+1,j);
				v[j]=false;
			}
		}
	}

}
