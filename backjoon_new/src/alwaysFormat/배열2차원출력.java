package alwaysFormat;

public class 배열2차원출력 {

	public static void main(String[] args) {
		
		int n=1;
		
		// 배열 선언
		boolean arr[][] = new boolean[n][n];
		
		// 배열 출력 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}

}
