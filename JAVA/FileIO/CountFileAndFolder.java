import java.io.*;
public class CountFileAndFolder{

    public static void main(String args[])
    {
        
        File f = new File("D:\\web development"); 
        //System.out.println(f.exists());

        String[] s = f.list();
        System.out.println(f.length());
        for(String s1:s)
        {
            File f1 = new File(f,s1);
            if(f1.isFile()) 
             System.out.println(s1);
        }

        return ;
    }
}