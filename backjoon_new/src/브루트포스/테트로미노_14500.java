package ���Ʈ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ��Ʈ�ι̳�_14500 {
	static int max;
	static int n;
	static int m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n =Integer.parseInt(st.nextToken());
		m =Integer.parseInt(st.nextToken());
		
		int arr [][] =new int[n][m];
		int tmp=0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		L(arr);
		thunder(arr);
		row(arr);
		square(arr);
		woo(arr);

	}
	private static void woo(int[][] arr) {
		// ��ť
		// x,y / x+1,y / x-1,y /x,y+1/ x,y-1
		// 5�� �Ѱ� ���ϱ� 
		// �� �� �迭�� ������ ���ư��鼭 ���鼭 ��
	}
	private static void square(int[][] arr) {
		
		//�׸�
		// x,y / x+1,y / x,y+1 / x+1,y+1 
	}
	private static void row(int[][] arr) {
		//����
		// �� �Ѱ� 
		// �� �Ѱ�
		
		// ���� �Ѿ�� �н� 
	}
	private static void thunder(int[][] arr) {
		// ����
		// x,y /x-1,y/ x,y+1, x+1,y+1 
		// x,y /x,y-1/ x-1,y//x-1,y+1
		// x,y / x+1,y /x,y+1 /x-1,y+1 
		//x,y-1/ x,y/ x+1,y /x+1,y+1 
					
	}
	// �� ��Ʈ�ι̳� ���� 
	private static void L(int[][] arr) {
		// �����
		// x,y / x-1,y / x+1,y / 
		// x,y / x,y-1 / x,y+1 / 
		//  + (-1,-1),(-1,1),(1,-1),(1,1)
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++) {
				int nx =x;
				int ny =y;
				if( !( 0<=nx && nx <n && 0<= ny && ny<m) ) continue;
				
			}
			
		}
	}
	
		
}
//for (int i = 0; i < arr.length; i++) {
//for (int j = 0; j < arr[i].length; j++) {
//	System.out.print(arr[i][j] +" ");
//}
//System.out.println();
//}
