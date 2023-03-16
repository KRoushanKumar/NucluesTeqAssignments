import java.util.ArrayList;

public class GenericMethodDemo {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Roushan");
        al.add("Ram");
        System.out.println(al);
        m1(al);
        System.out.println(al);
        //al.add(5);
        //error: incompatible types: int cannot be converted to String
    }

    private static void m1(ArrayList al) {
        al.add(10);
        al.add(5);

    }    
}