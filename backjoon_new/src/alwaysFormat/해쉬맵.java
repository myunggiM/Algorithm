package alwaysFormat;
import java.util.*;
public class 해쉬맵 {

	public static void main(String[] args) {
		HashMap<Integer,String> map =new HashMap<>();
		LinkedHashMap<Integer,String> lmap = new LinkedHashMap<>();// 넣은 순서 보장 hashmap
		Map<Integer,String> treemap =new TreeMap<>(); // key 기준 자동정렬
		map.put(1, "사과");
		map.put(9, "수박");
		map.put(3, "참외");
		
		lmap.put(1, "사과");
		lmap.put(2, "수박");
		lmap.put(3, "참외");
		
		
		treemap.put(1, "apple");
		treemap.put(3, "pineapple");
		treemap.put(2, "orange");
		
		
		for (Integer i : map.keySet()) {
			System.out.println(map.get(i));
		}
		for (Integer i : lmap.keySet()) {
			System.out.println(lmap.get(i));
		}
		for (Integer i : treemap.keySet()) {
			System.out.println(treemap.get(i));
		}
		
	}

}
