import java.util.ArrayList;

public class ArrayListEx 
{

    public static void main(String args[]) 
    {
       ArrayList<String> l = new ArrayList<String>();
       l.add("Roushan");
       l.add("kumar");
       l.add("25");

       System.out.println(l);

       for(String it:l)
       {
        System.out.println(it);
       }
       System.out.println("size of ArrayList is : "+l.size());

       l.remove(2);
       System.out.println("After Removing");
       System.out.println(l);


       l.add(0,"rohan");
       System.out.println("After inserting 0th index ");
       System.out.println(l);

       l.set(0,"rakesh");
       System.out.println("After replaceing 0th index ");
       System.out.println(l);

       System.out.println(l.contains("kumar"));

       ArrayList<String> al = new ArrayList<>(l);
       System.out.println(al);

       ArrayList<String> al2 = new ArrayList<String>(){
            {
                add("geeks");
                add("of");
                add("geeks");
            }
        };
       System.out.println(al2);


       

    }
    
}