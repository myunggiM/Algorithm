package realtest;

import java.util.ArrayList;

public class Solution2 {

	public static void main(String[] args) {

		int servers=2;
		boolean sticky =true;//false;
		int[] requests =new int[]{1,2,2,3,4,1};//{1,1,2,2};//{1,2,2,3,4,1};//// {1,2,3,4};
		
		int[][] result = solution(servers,sticky,requests);
		System.out.println(result);
	}

			private static int[][] solution(int servers, boolean sticky, int[] requests) {
				int [][] ans= new int[servers][requests.length/servers];
				ArrayList<Integer>[] list = new ArrayList[servers];
				for (int i = 0; i < list.length; i++) {
					list[i]= new ArrayList<Integer>();
				}
				int ns=0; //number server
				if(!sticky) { //false 일때
					for (int i = 0; i < requests.length; i++) {
							if(ns>=servers) {
								ns=0;
							}
							list[ns].add(requests[i]);
							ns++;
					}
				}else { // true 일때 
					int s,ms=0;
					for (int i = 0; i < requests.length; i++) {
						for (s = 0; s < servers; s++) {
							// 다음 차례 노트 ms
							if (list[s].size() <list[ms].size() || ( list[s].size() == list[ms].size() && s < ms)) ms=s;
							// System.out.println(list[s].size() +"ms"+ list[ms].size());
							if(list[s].contains(requests[i])) {
								list[s].add(requests[i]);
								ms=0; //ms 초기화
								break;
							}
						
						}
						if (s==servers) {
							list[ms].add(requests[i]); // 처음 들어가는 요소
							ms=0;
						}
						
					}
				}
				for (int j = 0; j < servers; j++) {
					for (int i = 0 ; i < requests.length/servers ; i++) {
						ans[j][i] = list[j].get(i).intValue();
						System.out.println(ans[j][i]);
					}
					
				}
				 //전체 스캔을 우선적으로 해야함..
				return ans;
			}

}
