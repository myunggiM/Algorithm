package alwaysFormat;
import java.util.*;
public class �ؽ��� {

	public static void main(String[] args) {
		HashMap<Integer,String> map =new HashMap<>();
		LinkedHashMap<Integer,String> lmap = new LinkedHashMap<>();// ���� ���� ���� hashmap
		Map<Integer,String> treemap =new TreeMap<>(); // key ���� �ڵ�����
		map.put(1, "���");
		map.put(9, "����");
		map.put(3, "����");
		
		lmap.put(1, "���");
		lmap.put(2, "����");
		lmap.put(3, "����");
		
		
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
