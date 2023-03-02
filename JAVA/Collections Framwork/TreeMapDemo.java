import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> t = new TreeMap<Integer,String>();
        t.put(103,"AAA");
        t.put(101,"xyz");

        System.out.println(t);

        TreeMap<Integer,String> tm = new TreeMap<Integer,String>(new MyComparator());

        tm.put(7,"a");
        tm.put(6,"b");
        tm.put(18,"c");
        tm.put(9,"d");

        System.out.println(tm);

    }
}

class MyComparator implements Comparator
{

    public int compare(Object a,Object b)
    {
        Integer c = Integer.parseInt(a.toString());
        Integer d = Integer.parseInt(b.toString());
        return c.compareTo(d);
    }
   
}