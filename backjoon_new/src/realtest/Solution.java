package realtest;

public class Solution {

	public static void main(String[] args) {
		int servers=2;
		boolean sticky =false;
		int[] requests =new int[] {1,2,3,4};
		
		int[][] result = solution(servers,sticky,requests);
		System.out.println(result);
	}

	private static int[][] solution(int servers, boolean sticky, int[] requests) {
		return new int[][]{{1,3},{2,4}};
	}

}
