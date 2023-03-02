import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(3);
        pq.add(7);
        pq.add(1);
        System.out.println(pq);
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(new Mycomparator2());
        pq1.add(3);
        pq1.add(2);
        pq1.add(9);
        pq1.add(6);
        System.out.println(pq1);
    }
}
class Mycomparator2 implements Comparator<Object>{

    @Override
    public int compare(Object o1, Object o2) {
       
        Integer a = (int)o1;
        Integer b = (int)o2;

        return b.compareTo(a);
    }

}

