import java.io.*;
public class FileReader_Example{

    public static void main(String args[]) throws IOException
    {
        File f = new File("File_writer_abc.txt");
        char[] ch = new char[(int)f.length()];
        FileReader fr = new FileReader(f);
        fr.read(ch);
        for(char ch1 : ch)
        {
           System.out.print(ch1);
        }
       // System.out.print(ch);
          fr.close();
        return ;

    }
}