package alwaysFormat;
import java.util.*;
class Prisoner implements Comparable<Prisoner>{
    String name;
    int weight; // ����

    public Prisoner(String name, int weight) {
        super();
        this.name = name;
        this.weight = weight;
    }
    @Override
    public int compareTo(Prisoner target) { // �������� ��������
        if (this.weight > target.weight) {
            return 1; // �ʰ� ����
        } else if (this.weight < target.weight) {
            return -1;  // ���� ����
        }
        return 0;
    }
}
public class �켱����ť_��ü {

	public static void main(String[] args) {
	    Prisoner prisoner1 = new Prisoner("james", 5);
	    Prisoner prisoner2 = new Prisoner("schofield", 99);
	    Prisoner prisoner3 = new Prisoner("alex", 14);
	    Prisoner prisoner4 = new Prisoner("silvia", 10);
	    Prisoner prisoner5 = new Prisoner("thomson", 1);
	    
	    PriorityQueue<Prisoner> pq = new PriorityQueue<>();

	    pq.offer(prisoner1);
	    pq.offer(prisoner2);
	    pq.offer(prisoner3);
	    pq.offer(prisoner4);
	    pq.offer(prisoner5);
	    
	    while (!pq.isEmpty()) {
            Prisoner prisoner = pq.poll();
            System.out.println(prisoner.name);
        }
	    
	}
	
	

}
