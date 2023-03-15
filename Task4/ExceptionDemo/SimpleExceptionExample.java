import java.util.Scanner;

public class SimpleExceptionExample {
 public static void main(String[] args) {
    int a=0,b=0,c=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a value of a: ");
    a=sc.nextInt();
    System.out.println("Enter a value of b: ");
    b=sc.nextInt();

    try {
        c=a/b;
        System.out.println("a/b = "+c);
    } catch (ArithmeticException e) {
        System.out.println("ArithmeticException ");
        System.out.println(e.getMessage());
        System.out.println("cannot divide number by zero.");
    }

    try {
        int number = Integer.parseInt("Value");
    } catch (NumberFormatException e) {
        System.out.println("NumberFormatException");
        System.out.println(e.getMessage());
    }
    try {
        int arr[] = new int[5];
        arr[9]=10;
     } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
    }
 }   
}
