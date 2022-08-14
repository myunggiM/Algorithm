package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 일곱난쟁이_2309 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] =new int[9];
		int max=0; //9 명 합
		for (int i = 0; i < 9; i++) {
			arr[i]= Integer.parseInt(br.readLine());
			max+=arr[i];
		}
		int x=0,y=0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(max-arr[i]-arr[j] ==100) {
					x=i;
					y=j;
					break;
				}
			}
		}
		int ans[] =new int[7];
		for (int i = 0,c =0; i < arr.length; i++) {
			if (i==x || i==y) continue;
			ans[c]=arr[i];
			c++;
		}
		Arrays.sort(ans);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

}
