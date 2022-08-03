package ���Ʈ����;

import java.util.Scanner;

public class ��������_3085 {
	public static char[][] board;	// �� ũ��
	public static int N;			// �� ũ��
	public static int max = 0;		// ���� �� �ִ� �ִ� ��������
	
	/* �� ���� ��ȯ�ϴ� �޼ҵ� */
	public static void swap(char a, char b) {
		char temp = a;
		a = b;
		b = temp;
	}
	
	/* ���η�, ���η� ���ϸ鼭 ���� �� �ִ� ������ �ִ� ���� ã�� */
	public static void arrCheck() {
		
		// �� ���η� üũ
		for(int i=0; i<N; i++) {
			int count = 1;
			for(int j=0; j<N-1; j++) {
				
				// ���� ������ ������ ��� -> ��� �Դ´�
				if(board[i][j] == board[i][j+1])
					count ++;
				
				// ������ �ٸ� ������ ��� -> ���� �Ծ���ϹǷ� 1�� �ʱ�ȭ
				else 
					count = 1;
				
				// ���� �ִ� ���� ����
				max = Math.max(max, count);
			}
		}
		
		// �� ���η� üũ
		for(int i=0; i<N; i++) {
			int count = 1;
			for(int j=0; j<N-1; j++) {
				if(board[j][i] == board[j+1][i])
					count ++;
				else 
					count = 1;
				max = Math.max(max, count);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();	// ������ ũ��
		board = new char[N][N];
		
		/* N x N ���� �Է¹ޱ� */
		for(int i=0; i<N; i++) {
			String str = scan.next();
			for(int j=0; j<board[i].length; j++) {
				board[i][j] = str.charAt(j);
			}
		}
		
		/* ���η� ������ �� ���� ��ȯ�ϰ� �ִ� ���� ���� ã�� ����ġ */
		for(int i=0; i<N; i++) {
			for(int j=0; j<N-1; j++) {
				// ���η� ������ �� ���� ��ȯ
				//swap(board[i][j], board[i][j+1]);
				char temp = board[i][j];
				board[i][j] = board[i][j+1];
				board[i][j+1] = temp;
				
				// ��, �� üũ
				arrCheck();
				
				// ������ ��ȯ�� ���� ����
				//swap(board[i][j], board[i][j+1]);
				temp = board[i][j];
				board[i][j] = board[i][j+1];
				board[i][j+1] = temp;
			}
		}
		
		/* ���η� ������ �� ���� ��ȯ�ϰ� �ִ� ���� ���� ã�� ����ġ */
		for(int i=0; i<N; i++) {
			for(int j=0; j<N-1; j++) {
				//swap(board[j][i], board[j+1][i]);
				
				char temp = board[j][i];
				board[j][i] = board[j+1][i];
				board[j+1][i] = temp;
				
				// ��, �� üũ
				arrCheck();
				
				// ������ ��ȯ�� ���� ����
				//swap(board[j][i], board[j+1][i]);
				temp = board[j][i];
				board[j][i] = board[j+1][i];
				board[j+1][i] = temp;
			}
		}
		
		System.out.println(max);
		scan.close();
	}

}