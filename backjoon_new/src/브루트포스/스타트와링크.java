package ���Ʈ����;

import java.util.Scanner;

public class ��ŸƮ�͸�ũ {
	static int map[][];
	static int n;
	static boolean[] visit;
	
	static  int Min =Integer.MAX_VALUE;
	public static void main(String[] args) {
		//�Է� ��
		// �� ���� ����? �ּڰ�? 
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
		// ���� �� �����̶� ������ ���� �ּҰ� �ǵ��� ���� 
		// + �Ѱ��� ���� ���� 
		// �׻� x�� �۾ƾߵ� 
		
		// ��� 
		// dfs 
		// �������� �ϴ� �ڵ� 
		
		
	}
	private static void combi(int idx, int cnt) {
		// ���� �ϼ� 
		if(cnt ==n/2) {
			// �湮�� ���� �湮 ������������ ������ ������ ������ ���ѵ� �ּڰ� 
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
