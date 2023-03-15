import java.io.*;
public class FileWriterEx{

    public static void main(String args[]) throws IOException
    {
        FileWriter fw = new FileWriter("File_writer_abc.txt",false);

        fw.write(97);
        fw.write('\n');
        char[] ch = {'a','b','c'};
        fw.write(ch);
        fw.write('\n');
        fw.flush();
        fw.close();

        
        return ;
    }
}