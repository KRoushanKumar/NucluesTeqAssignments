import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

    public static void main(String args[]) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(5);
        l.add(6);
        l.add(9);     

        ListIterator it = l.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}