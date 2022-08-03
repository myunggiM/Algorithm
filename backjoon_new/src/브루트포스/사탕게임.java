package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사탕게임 {
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
					//다르면 교체
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
						
						//원복
						tmp=arr[i][j];
						arr[i][j]=arr[x][y];
						arr[x][y]=tmp;
					}
				}
			}
		}
		System.out.println(max);
	}
	// for 문 2번 전체 
	// visited i,j true 
	// if 지금 i,j 꺼랑 x y 가 vistied f 이고 변경된 x y 값이랑 다르면 바꾸고 
	// 전체 행 열 카운트
	// 세는 함수 fun int maxCnt(char[][]) if cnt =n-1이면 sysout 찍고 return / / cnt > max then max= cnt;
	// int c=0
	// for 문 2번 전체 현 위치 int sx sy 랑 ex ey 
	// 행세기: ey= sy+1 초기화 
	// 같으면 ey+1 단, n-1보다 작 또는 같시 c값보다 크면 갱신 다르면 (c값보다 크면 갱신)sx=ex sy=ey // 반복
	// 열세기 ex= sx+1 로 초기화
	// 같으면 ex+1 다르면 sx=ex sy=ey // ex+1 단, n 보다 작같 // 반복
	// (n보다 작고) max보다 크면 업데이트 
	// 바꾼거 원복
	private static int maxCnt(char[][] arr) {
		int c=0;
		for (int x = 0; x < arr.length; x++) {
			int sy=0;
			int ey=1;
			while(true) // 수정
			{
				int val= ey-sy;
				if(arr[x][sy]!=arr[x][ey]) {// 다르면				
					if(c<val) { //최대 사탕수
						c = val;
					}
					sy=ey;
				}
				ey++;
				//ey 가 끝(n-1)이었을경우 
				if(ey==arr.length) {
					if(arr[x][sy]==arr[x][ey-1]) {
						if(c<val+1) c=val+1;
					}
					// 최대치면 끝 
				//	if(c==arr.length) return arr.length;
					// 끝이므로 탈출
					
					break;
				}
			}
		}
		for (int y = 0; y < arr.length; y++) {
			int sx=0;
			int ex=1;
			while(true) // 수정
			{
				int val= ex-sx;
				if(arr[sx][y]!=arr[ex][y]) {// 다르면				
					if(c<val) { //최대 사탕수
						c = val;
					}
					sx=ex;
				}
				ex++;
				//ex 가 끝(n-1)이었을경우 
				if(ex==arr.length) {
					if(arr[sx][y]==arr[ex-1][y]) {
						if(c<val+1) c=val+1;
					}
					// 최대치면 끝 
					//if(c==arr.length) return arr.length;
					// 끝이므로 탈출
					break;
				}
			}
		}
		return c;
	}
}

