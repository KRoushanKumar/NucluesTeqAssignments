import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("add "+(a+b));
        System.out.println("mod "+(a%b));
        
        System.out.println("sub "+(a-b));
        System.out.println("divide "+(a/b));

    }
}

