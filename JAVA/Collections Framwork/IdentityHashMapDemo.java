import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> m = new HashMap<String,String>();
        m.put(new String("5"),"Roushan");
        m.put(new String("5"),"Ram");

        IdentityHashMap<String,String> im = new IdentityHashMap<String,String>();
        im.put(new String("5"),"Roushan Kumar");
        im.put(new String("5"),"Ram Kumar");

        System.out.println(m);
        System.out.println(im);    
    }
    
}
