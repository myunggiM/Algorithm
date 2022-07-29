package 자료구조_basic;
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;


public class 오큰수_17298 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		int arr[] =new int[n];//배열 최대 크기?
		Stack<Integer> stack= new Stack<Integer>();
		for (int i = 0; i <n ; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		for (int j = 0; j < n; j++) {
			while(!stack.isEmpty() && arr[stack.peek()] <arr[j]) {
				arr[stack.pop()] =arr[j];
			}
			stack.push(j);
		}
		
		while(!stack.empty()) {
			arr[stack.pop()] =-1;
		}
			// 현 위치 값, j 위치값 비교 후 현 >j push 
			// 현<j pop 한 위치 꺼들 다 arr[pop] = arr[j] / arr[현] =arr[j]
		StringBuilder sb =new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(arr[i]).append(' ');
		}
		System.out.println(sb);
	}

}
