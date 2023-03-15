import java.util.ArrayList;

class Account<T>
{
    T ob;
    public Account(T ob)
    {
        this.ob=ob;
    }
    public void show()
    {
        System.out.println(ob);
    }
}

class fun<V extends Number> {
    V a;
    V b;

    public fun(V a,V b)
    {
        this.a=a;
        this.b=b;
    }
    
    public void show()
    {
        System.out.println(a+" , "+b);
    }
    
}

class Display
{
    public void show(ArrayList<?> al)
    {
        System.out.println(al);
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        Account<String> a1 = new Account<String>("Roushan");
        a1.show();

        Account<Integer> a2 = new Account<Integer>(25);
        a2.show();
        
        ArrayList<Integer> al1 = new ArrayList<Integer>();

        al1.add(10);
        al1.add(11);
        al1.add(12);

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Ram");
        al2.add("shyam");
        al2.add("Mohan");
        
        Display d = new Display();
        d.show(al1);
        d.show(al2);
    }
}
