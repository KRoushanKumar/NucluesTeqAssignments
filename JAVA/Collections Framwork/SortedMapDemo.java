import java.util.SortedMap;
import java.util.TreeMap;

/**
 * SortedMapDemo
 */
public class SortedMapDemo {

    public static void main(String[] args) {
        SortedMap<Integer,String> sm = new TreeMap<Integer,String>();

        sm.put(105,"A");
        sm.put(101,"B");
        sm.put(100,"C");

        System.out.println(sm);

    }
}