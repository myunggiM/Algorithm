package codeTree;

import java.io.*;
import java.util.*;

public class Main2 {
    static int map[][];
    static int max =0;
    static int [][] d = {
        {-1,0},{1,0},{0,-1},{0,1}
    };
    static int n,m;
    static int goldTotal;
    static boolean visited[][];
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // ���� ũ�� 
        m = Integer.parseInt(st.nextToken()); // �� ����
        map =new int[n][n];
        
        for (int i = 0; i < n; i++) {
             st = new StringTokenizer(br.readLine());
			 for (int j = 0; j < n; j++) {
				  map[i][j] = Integer.parseInt(st.nextToken());
                  if(map[i][j]==1) goldTotal++;
			}
		}
        int max=0;
        for (int i = 0; i < n; i++) {
			 for (int j = 0; j < n; j++) {
				  max = Math.max(draw(i,j),max);
			}
		}
        System.out.println(max);
    }
    
    // �̹� �ѰŴ� ���� 
    // �� �� ������ ���� ��� x 
    static int PaymentK(int k){
        return k*k+(k+1)*(k+1);
    }

    static boolean visitedFlag(int x, int y){
        return visited[x][y];
    }
    static void visitedClear(){
        for (int i = 0; i < n; i++) { 
            Arrays.fill(visited[i], false);
        }
    }
    static boolean inRange(int x, int y){
        return (x>=0 && y>=0 && x<n && y<n);
    }
    
    static int draw(int i, int j){
        // �ʱ�ȭ
        LinkedList<int[]> q =new LinkedList<int[]>();;
        visited =new boolean[n][n];
        int k=0;
        int totalk= PaymentK(k);
        int goldCnt = 0;
        int goldMax = 0;
        // �湮�ϸ� �н�

        q.add(new int[]{i,j,k});
        visited[i][j]=true;

        while(totalk <= goldTotal*m){  // ��� �� ��� �ִ밪
        	totalk= PaymentK(k); // k�� Ŀ���� ���� ��� 
           
            while(k == q.peek()[2]){  
                int arr []= q.poll();
                if(map[arr[0]][arr[1]]==1) goldCnt++;
                // if(arr[2]==k) continue; // �ѹ��� ������
                // ������ ���ļ� ��� �ֱ�
                //if(PaymentK(k+1)> goldTotal*m) continue;
                for (int di = 0; di < 4; di++) {
                    int x = arr[0] +d[di][0];
                    int y = arr[1] +d[di][1];
                    if(!inRange(x,y)) continue;
                    if(visitedFlag(x,y)) continue;
                    q.add(new int[]{x,y,k+1});
                    visited[x][y]=true;
                }
                    
            }

            if(totalk <= goldCnt*m) goldMax =Math.max(goldCnt,goldMax); //���� �Ⱥ��� ����
            if(goldTotal==goldMax) break;
            
            k++;
        }
        return goldMax; // ���̻� Ŀ���� �ǹ� ����
    }
    
}


