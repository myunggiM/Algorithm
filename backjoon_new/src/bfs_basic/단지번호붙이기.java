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

public class ������ȣ���̱� {
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
					//�湮 
					visited[i][j]=true;
					//����
					q.add(new int[]{i,j});
					//���� �߰���
					cnt++;
					//�� ������
					house=0;
					while(!q.isEmpty()) {
						int [] p =q.poll();
						house++;
						//���ϵ��� ȸ��
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
		
		 
		 //for 2�� ��ü ����
		 // if 1 ������ vists false �̸� 
		 // visited true �ϰ� stack.push , cnt+1
		 // while(q.isempty)
		 // poll �ϰ� house +1 / pop�� d ȸ�� ���� v f �̰�, 1�̸� true �ϰ� ,push
		 // house pq �� �ְ� house=0;
		 
		// �¿� ���Ʒ� ���� 
		 //�� �� ���� ó��
		 // visisted �湮�� true 
		 // ������ ��� cnt 
		 // �������� ���� �� ��� p q / house��
	  
	}

}


