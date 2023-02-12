// wrrite a code to merge two file into  singal file.

import java.io.*;

public class assinment1
{
    public static void main(String args[]) throws IOException{
        System.out.println("hello");

        File thirdFile = new File("thirdFile.txt");
        thirdFile.createNewFile();

        File firstFile = new File("ABC.txt");
        File secondFile = new File("abcd.txt");

        BufferedReader br1 = new BufferedReader(new FileReader(firstFile));
        BufferedReader br2 = new BufferedReader(new FileReader(secondFile));
        PrintWriter pr3 = new PrintWriter(thirdFile);
        String s1 = br1.readLine();
        String s2 = br2.readLine();

        while(s1!=null || s2!=null)
        {
                if(s1!=null)
                pr3.println(s1);

                if(s2!=null)
                pr3.println(s2);

                s1=br1.readLine();
                s2=br2.readLine();
        }

        pr3.close();
        br1.close();
        br2.close();
        
        
    }
}