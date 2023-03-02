import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(8);
        arr.add(5);
        arr.add(6);

        System.out.println("Befor sorting\n"+arr);
        Collections.sort(arr);
        System.out.println("After sorting\n"+arr);

    }
    
}
