package dp_basic;


import java.io.*;
import java.util.*;
public class Main {
    static int k,n;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine()); 
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        for(int i=n ;i>=1 ;i--){
            dfs(i,0);
        }
    }
    static void dfs(int m,int d){
        // k 번 돌면 멈추기 
        if(d==k) {
            System.out.println();
            return;
        }
        for(int i= n;i>=1 ;i--){
        	System.out.print(n+" ")
    ;
        }
//        for(int i= n;i>=1 ;i--){
//        	System.out.print(i+" ");
//            dfs(i,d+1);
//        }
        
    }
}