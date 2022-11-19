package dfs;

import java.util.*;
public class dfs {
    static int n,m,ans;
    static int [][] map;
    static boolean [] visited;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n= sc.nextInt();
        m= sc.nextInt();
        ans=0;
        map =new int [n+1][n+1];
        visited =new boolean [n+1];
        for(int i =1; i<=m;i++){
            int a =sc.nextInt();
            int b =sc.nextInt();
            map[a][b]=map[b][a]=1;
        }
        // DFS 
        visited[1]=true;
        DFS(1);
        // Ãâ·Â
        System.out.println(ans);
    }
    static void DFS(int s){
        for(int i =1; i<=n;i++){
            if(map[s][i]==1 && !visited[i]){
                visited[i]=true;
                ans++;
                DFS(i);
            }
        }
    }
}