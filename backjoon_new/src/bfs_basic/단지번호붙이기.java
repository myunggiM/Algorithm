package bfs_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class 단지번호붙이기 {
	static int[][] d = {{-1,0},{0,-1},{0,1},{1,0}};
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int n= Integer.parseInt(br.readLine());
	     boolean visited[][] =new boolean[n][n];
	     char town[][] =new char[n][n]; 
	     Queue<int []> q =new LinkedList<>();
	     PriorityQueue<Integer> pq =new PriorityQueue<>();
		 int cnt=0;
		 int house;
	     for (int i = 0; i < n; i++) {
			town[i]=br.readLine().toCharArray();
		}
		for (int i = 0; i < town.length; i++) {
			for (int j = 0; j < town.length; j++) {
				if(town[i][j]=='1'&& !visited[i][j]) {
					//방문 
					visited[i][j]=true;
					//삽입
					q.add(new int[]{i,j});
					//단지 추가요
					cnt++;
					//집 세보자
					house=0;
					while(!q.isEmpty()) {
						int [] p =q.poll();
						house++;
						//서북동남 회전
						for (int dx = 0; dx < d.length; dx++) {
							int x =p[0]+d[dx][0];
							int y =p[1]+d[dx][1];
							if(x<0 || y<0 || x==n || y==n ) continue;
							if(town[x][y]=='1' && !visited[x][y]) {
								visited[x][y]=true;
								q.add(new int[]{x,y});
							}
							
						}		
					}
					pq.add(house);
				}
				
			}
			
		}
		System.out.println(cnt);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		 
		 //for 2중 전체 돌기
		 // if 1 만나고 vists false 이면 
		 // visited true 하고 stack.push , cnt+1
		 // while(q.isempty)
		 // poll 하고 house +1 / pop에 d 회전 시작 v f 이고, 1이면 true 하고 ,push
		 // house pq 에 넣고 house=0;
		 
		// 좌우 위아래 보고 
		 //각 끝 예외 처리
		 // visisted 방문시 true 
		 // 단지수 출력 cnt 
		 // 오름차순 집의 수 출력 p q / house값
	  
	}

}


