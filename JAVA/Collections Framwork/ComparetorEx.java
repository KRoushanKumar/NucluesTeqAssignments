import java.util.Comparator;
import java.util.TreeSet;
import java.util.*;

/**
 * MyComparator
 */
class MyComparator implements Comparator {
   
       public int compare(Object obj1 , Object obj2)
       {
            Integer a = (Integer)obj1;
            Integer b = (Integer)obj2;

            // if(a<b)
            //     return 1;
            // else if(a>b)
            //     return -1;
            // else
            //     return 0;

            return -a.compareTo(b);
       }
}

public class ComparetorEx {

    public static void main(String[] args) {
        
        TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator());
        t.add(15);
        t.add(51);
        t.add(25);
        t.add(53);
        t.add(45);

        System.out.println(t);

    }
}


