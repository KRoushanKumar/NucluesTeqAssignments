import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
        ht.put(5,"A");
        ht.put(2,"A");
        ht.put(6,"A");
        ht.put(15,"A");
        ht.put(23,"A");
        ht.put(16,"A");
        System.out.println(ht);

    }

}