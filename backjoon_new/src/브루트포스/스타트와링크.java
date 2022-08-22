package 브루트포스;

import java.util.Scanner;

public class 스타트와링크 {
	static int map[][];
	static int n;
	static boolean[] visit;
	
	static  int Min =Integer.MAX_VALUE;
	public static void main(String[] args) {
		//입력 받
		// 다 돌고 갱신? 최솟값? 
		Scanner in =new Scanner(System.in);
		
		n= in.nextInt();
		
		map =new int[n][n];
		visit =new boolean[n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j]=in.nextInt();
			}
		}
		
		combi(0,0);
		System.out.println(Min);
		// 절반 합 뺀값이랑 절반의 값이 최소가 되도록 갱신 
		// + 한값을 위에 적어 
		// 항상 x가 작아야됨 
		
		// 재귀 
		// dfs 
		// 팀조합을 하는 코드 
		
		
	}
	private static void combi(int idx, int cnt) {
		// 조합 완성 
		if(cnt ==n/2) {
			// 방문한 팀과 방문 하지않은팀을 나누어 각팀의 점수를 구한뒤 최솟값 
			 diff();
			 return;
		}
		for (int i = idx; i < map.length; i++) {

				if (!visit[i]) {
					visit[i]=true;
					combi(i+1,cnt+1);
					visit[i]=false;
				}
					

		}
	}
	private static void diff() {
		int team_start=0;
		int team_link=0;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if(visit[i]==true && visit[j]==true) {
					team_start+=map[i][j];
					team_start+=map[j][i];
				}else if(visit[i]==false && visit[j]==false){
					team_link+=map[i][j];
					team_link+=map[j][i];
				}
			}
		}
		int val = Math.abs(team_start-team_link);
		if(val ==0 ) {
			System.out.println(val);
			System.exit(0);
		}
		
		Min =Math.min(val, Min);
	}

}
