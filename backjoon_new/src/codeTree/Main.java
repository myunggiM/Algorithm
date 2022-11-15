package codeTree;

// 완탐 여부 확인 
// 1초 면 n=500 n^3 까지 가능 

import java.io.*;
import java.util.*;

public class Main {
    static int d[][] ={{-1,1},{-1,-1},{1,-1},{1,1}}; //순서 대로 
    static int map[][];
    static int n;
    static int max =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 격자 크기
        map =new int[n][n];
           
        for (int i = 0; i < n; i++) {
			 for (int j = 0; j < n; j++) {
				  map[i][j] = sc.nextInt();
			}
		}
        // 순회
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
        // D 4다 돌면 MAX 값 갱신 하고 리턴 
        if(step==4) {
        	if(i==si && j==sj) max = Math.max(total,max);
        	else {
        		// 현재 d 더한 값
                x= i+d[step-1][0];
                y= j+d[step-1][1];
                if(inRange(x,y)) dfs(x,y,total+map[x][y],step,si,sj);
        	}
            return;
        }
        if(step==0){ // 처음일때,
            x= i+d[0][0];
            y= j+d[0][1];
            if(inRange(x,y)) dfs(x,y,total+map[x][y],step+1,si,sj);
            
        }else{ // 처음 아닐때, 
            
            // 다음 d 더한 값
            x= i+d[step][0];
            y= j+d[step][1];
            if(inRange(x,y)) dfs(x,y,total+map[x][y],step+1,si,sj);
            
            // 현재 d 더한 값
            x= i+d[step-1][0];
            y= j+d[step-1][1];
            if(inRange(x,y)) dfs(x,y,total+map[x][y],step,si,sj);

        
        }
        return;

    }

    // DFS (X,Y,D 스텝)
        

    // 그 다음 D 더한값 
    //  inrange 체크 후 그럼 DFS ㄱ 
    // 안돼? return 
    // 현재 D 더 한값 
    // inrange 가능?  그럼 DFS ㄱ
    // 안돼? return
    
}