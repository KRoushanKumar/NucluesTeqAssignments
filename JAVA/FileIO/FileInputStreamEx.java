import java.io.*;
public class FileInputStreamEx
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream f = new FileInputStream("ABC.txt");

        int ch = f.read();
        while(ch!=-1)
        {
            System.out.print((char)ch);
            ch=f.read();
        }

        System.out.println("hello");      
    }
}