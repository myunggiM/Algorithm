package ���Ʈ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �������� {
	static int d[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		int max=0;
		boolean visited[][] =new boolean[n][n];
		char[][] arr =new char[n][n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=br.readLine().toCharArray();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				visited[i][j]=true;
				for (int t = 0; t < 4; t++) {
					int x =i+d[t][0];
					int y =j+d[t][1];
					if(x<0 || x==n || y<0 || y==n) continue;
					//�ٸ��� ��ü
					if (!visited[x][y] && arr[i][j]!=arr[x][y]) {
						char tmp=arr[i][j];
						arr[i][j]=arr[x][y];
						arr[x][y]=tmp;
						int cnt= maxCnt(arr);
						if (cnt==n) {
							System.out.println(n);
							return;
						}
						if(cnt > max) max=cnt;
						
						//����
						tmp=arr[i][j];
						arr[i][j]=arr[x][y];
						arr[x][y]=tmp;
					}
				}
			}
		}
		System.out.println(max);
	}
	// for �� 2�� ��ü 
	// visited i,j true 
	// if ���� i,j ���� x y �� vistied f �̰� ����� x y ���̶� �ٸ��� �ٲٰ� 
	// ��ü �� �� ī��Ʈ
	// ���� �Լ� fun int maxCnt(char[][]) if cnt =n-1�̸� sysout ��� return / / cnt > max then max= cnt;
	// int c=0
	// for �� 2�� ��ü �� ��ġ int sx sy �� ex ey 
	// �༼��: ey= sy+1 �ʱ�ȭ 
	// ������ ey+1 ��, n-1���� �� �Ǵ� ���� c������ ũ�� ���� �ٸ��� (c������ ũ�� ����)sx=ex sy=ey // �ݺ�
	// ������ ex= sx+1 �� �ʱ�ȭ
	// ������ ex+1 �ٸ��� sx=ex sy=ey // ex+1 ��, n ���� �۰� // �ݺ�
	// (n���� �۰�) max���� ũ�� ������Ʈ 
	// �ٲ۰� ����
	private static int maxCnt(char[][] arr) {
		int c=0;
		for (int x = 0; x < arr.length; x++) {
			int sy=0;
			int ey=1;
			while(true) // ����
			{
				int val= ey-sy;
				if(arr[x][sy]!=arr[x][ey]) {// �ٸ���				
					if(c<val) { //�ִ� ������
						c = val;
					}
					sy=ey;
				}
				ey++;
				//ey �� ��(n-1)�̾������ 
				if(ey==arr.length) {
					if(arr[x][sy]==arr[x][ey-1]) {
						if(c<val+1) c=val+1;
					}
					// �ִ�ġ�� �� 
				//	if(c==arr.length) return arr.length;
					// ���̹Ƿ� Ż��
					
					break;
				}
			}
		}
		for (int y = 0; y < arr.length; y++) {
			int sx=0;
			int ex=1;
			while(true) // ����
			{
				int val= ex-sx;
				if(arr[sx][y]!=arr[ex][y]) {// �ٸ���				
					if(c<val) { //�ִ� ������
						c = val;
					}
					sx=ex;
				}
				ex++;
				//ex �� ��(n-1)�̾������ 
				if(ex==arr.length) {
					if(arr[sx][y]==arr[ex-1][y]) {
						if(c<val+1) c=val+1;
					}
					// �ִ�ġ�� �� 
					//if(c==arr.length) return arr.length;
					// ���̹Ƿ� Ż��
					break;
				}
			}
		}
		return c;
	}
}

