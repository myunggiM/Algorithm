package 자료구조_basic;
import java.io.*;
public class 알파벳개수_10808 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str =br.readLine();
		// a =97
		// 97을뺀 값을 인덱스로 지칭 
		int arr[]=new int[26];
		for (int i = 0; i < str.length(); i++) {
			int index =str.charAt(i) -97;
			arr[index]++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
