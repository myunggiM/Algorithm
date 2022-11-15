package codeTree;

// ��Ž ���� Ȯ�� 
// 1�� �� n=500 n^3 ���� ���� 

import java.io.*;
import java.util.*;

public class Main {
    static int d[][] ={{-1,1},{-1,-1},{1,-1},{1,1}}; //���� ��� 
    static int map[][];
    static int n;
    static int max =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // ���� ũ��
        map =new int[n][n];
           
        for (int i = 0; i < n; i++) {
			 for (int j = 0; j < n; j++) {
				  map[i][j] = sc.nextInt();
			}
		}
        // ��ȸ
        for (int i = 0; i < n; i++) {
			 for (int j = 0; j < n; j++) {
				  dfs(i,j,0,0,i,j);
			}
		}
        
        System.out.println(max);
    
        
    }
    static boolean inRange(int x,int y){
        return (0 <= x && x < n && 0 <= y && y < n);
    }
    static void dfs(int i,int j, int total, int step ,int si,int sj){
        int x,y;
        // D 4�� ���� MAX �� ���� �ϰ� ���� 
        if(step==4) {
        	if(i==si && j==sj) max = Math.max(total,max);
        	else {
        		// ���� d ���� ��
                x= i+d[step-1][0];
                y= j+d[step-1][1];
                if(inRange(x,y)) dfs(x,y,total+map[x][y],step,si,sj);
        	}
            return;
        }
        if(step==0){ // ó���϶�,
            x= i+d[0][0];
            y= j+d[0][1];
            if(inRange(x,y)) dfs(x,y,total+map[x][y],step+1,si,sj);
            
        }else{ // ó�� �ƴҶ�, 
            
            // ���� d ���� ��
            x= i+d[step][0];
            y= j+d[step][1];
            if(inRange(x,y)) dfs(x,y,total+map[x][y],step+1,si,sj);
            
            // ���� d ���� ��
            x= i+d[step-1][0];
            y= j+d[step-1][1];
            if(inRange(x,y)) dfs(x,y,total+map[x][y],step,si,sj);

        
        }
        return;

    }

    // DFS (X,Y,D ����)
        

    // �� ���� D ���Ѱ� 
    //  inrange üũ �� �׷� DFS �� 
    // �ȵ�? return 
    // ���� D �� �Ѱ� 
    // inrange ����?  �׷� DFS ��
    // �ȵ�? return
    
}