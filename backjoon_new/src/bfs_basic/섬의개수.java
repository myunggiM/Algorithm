package bfs_basic;

import java.io.*;
import java.util.*;

class Position{
	int x;
	int y;
	public Position(int i, int j) {
		x=i;
		y=j;
	}
	
}
public class 섬의개수 {
	
	static int [][] d = {{0,-1},{-1,-1},{1,-1},{-1,0},{1,0},{-1,1},{0,1},{1,1}};
	static boolean v[][] ;
	
	public static void main(String[] args) throws IOException {
		 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st; 
		 int w,h;
		 Position p; 
		 int map[][];
		 while(true) {
			 st= new StringTokenizer(br.readLine());
			 w = Integer.parseInt(st.nextToken());
			 h = Integer.parseInt(st.nextToken());
			 if(w==0&&h==0) break;
			 map=new int[h][w]; 
			 for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					map[i][j]= Integer.parseInt(st.nextToken());
				} 
			}
			v =new boolean[h][w]; 
			 // v 배열 만들기  1이고 v true 아니면 true 후 q에 넣기 q가 비면 +1 
			
			//전체 돌기 
			
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if(map[i][j]==1 && !v[i][j]) {
						//방문 처리
						bfs(i,j);
						
						
						// 마지막 +1 처리 
					}
				}
			}
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		 }
		 

	
	}
	private static void bfs(int i, int j) {
		Queue<Position> q= new LinkedList<Position>(); 
		v[i][j]=true;
		// q에 넣고 돌려버려
		q.add(new Position(i,j));
	}

}
