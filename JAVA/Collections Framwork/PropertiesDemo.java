import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception 
    {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("app.properties");
        p.load(fis);
        System.out.println(p);

        if(p.getProperty("user").equals("Roushan559"))
        System.out.println("Hello Roushan");

        p.setProperty("url", "https://google.com");
        p.setProperty("path", "D:\\download");

        FileOutputStream fos = new FileOutputStream("app.properties");
        p.store(fos, "url update by Roushan Kumar");
    }
}
