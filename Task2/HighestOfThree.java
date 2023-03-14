import java.util.Scanner;

public class HighestOfThree {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();

        if(a>=b && a>=c)
            System.out.println("highest of three is "+ a);
        else if(b>=a && b>=c)
        {
            System.out.println("highest of three is "+ b);
        }
        else 
            System.out.println("highest of three is "+ c);
            sc.close();
          
            
    }
}
