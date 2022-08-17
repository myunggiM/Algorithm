package 그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ABCDE {
	static ArrayList<Integer>[] list;
	static boolean visited[];
	static int n;
	public static void main(String[] args) throws IOException {
		// 순차적으로 나열된게 아니고, 랜덤 친구 숫자이므로 배열은 안되고, Arraylist 를 써야함
		 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 n = Integer.parseInt(st.nextToken());
		 int m = Integer.parseInt(st.nextToken());
		 list = new ArrayList[n];
		 for (int i = 0; i < n; i++) {
			 list[i] =new ArrayList<>();
		}
		 
		 for (int i = 0; i < m; i++) {
			 st = new StringTokenizer(br.readLine());
			 int a =Integer.parseInt(st.nextToken()); 
			 int b =Integer.parseInt(st.nextToken());
			 list[a].add(b);
			 list[b].add(a);
		}
		 for (int i = 0; i < n; i++) {
			 visited= new boolean[n];
			 dfs(i,0);
		}
		 System.out.println(0);
		
	}
	private static void dfs(int key, int len) {
		if(len==4) { // 4번의 친구만 겪으면 되므로 4 
			System.out.println(1);
			System.exit(0);
		}
		visited[key]=true;
		for (int j = 0; j < list[key].size(); j++) {
			int temp = list[key].get(j);
			if(!visited[temp]) {
				visited[temp]=true;
				dfs(temp,len+1);
				visited[temp]=false;
			}
		}
	}	

}
