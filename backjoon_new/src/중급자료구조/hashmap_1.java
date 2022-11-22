package 중급자료구조;
import java.util.*;
public class hashmap_1 {

	    public static void main(String[] args) {
	        Scanner sc =new Scanner(System.in);
	        HashMap<Integer,Integer> map =new HashMap<>();
	        int line = sc.nextInt();
	        int value;
	        while(line-->0){
	            String str = sc.next();
	            int key =sc.nextInt();
	            switch(str){
	                case "add":
	                    value =sc.nextInt();
	                    if(map.containsKey(key)){
	                        map.remove(key);
	                    }
	                    map.put(key,value);
	                    break;
	                case "find":
	                    if(map.containsKey(key)){
	                        System.out.println(map.get(key));
	                    }else{
	                        System.out.println("None");
	                    }
	                    break;
	                case "remove":
	                    map.remove(key);
	                    break;
	                default: 
	                        break;
	            }
	        }
	    }
	

}
