//BufferWriter_example.java
import java.io.*;

public class BufferWriter_example{
    public static void main(String args[]) throws IOException
    {
        FileWriter fw = new FileWriter("ABC.txt",true);

        BufferedWriter bw = new BufferedWriter(fw);

        char[] ch = {'a','b','c','d'};

        bw.write(ch);
        bw.newLine();
        bw.write(ch);
        bw.newLine();
        bw.write("hello everyone ..!");
        bw.flush();
        bw.close();

        return ;
    }
}