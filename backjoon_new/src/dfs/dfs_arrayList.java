package dfs;

import java.util.*;
public class dfs_arrayList {
    static int n,m,ans;
    static int MAX_NUM =1000;
    static int [][] map;
    static boolean [] visited;
    static ArrayList<Integer>[] list = new ArrayList[MAX_NUM+1];
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n= sc.nextInt();
        m= sc.nextInt();
        ans=0;
        for(int i =1; i<=n;i++){
            list[i] =new ArrayList<>();
        }
  
        visited =new boolean [n+1];
        for(int i =1; i<=m;i++){
            int a =sc.nextInt();
            int b =sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }
        // DFS 
        
        visited[1]=true;
        DFS(1);
        // Ãâ·Â
        System.out.println(ans);
    }
    static void DFS(int s){
        for(int i =0; i<list[s].size();i++){
            int v = list[s].get(i);
            if(!visited[v]){
                visited[v]=true;
                ans++;
                DFS(v);
            }
        }
    }
}