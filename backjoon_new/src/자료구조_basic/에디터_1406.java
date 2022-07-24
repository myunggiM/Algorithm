package 자료구조_basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 에디터_1406 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Stack stL = new Stack<>();
		Stack stR = new Stack<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			stL.push(str.charAt(i));
		}

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String com = br.readLine();
			if (com.equals("L")) {
				if (!stL.empty()) {
					stR.push(stL.pop());
				}
			} else if (com.equals("D")) {
				if (!stR.empty()) {
					stL.push(stR.pop());

				}
			} else if (com.equals("B")) {
				if (!stL.empty()) {
					stL.pop();
				}
			} else if (com.contains("P")) {
				char c = com.charAt(2);
				stL.push(c);
			}

		}

		while (!stL.empty()) {
			stR.push(stL.pop());
		}

		while (!stR.empty()) {
			bw.write(stR.pop().toString());
		}
		bw.flush();
		bw.close();

	}

}
