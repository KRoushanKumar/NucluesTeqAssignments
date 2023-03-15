import java.util.Scanner;
public class ThrowsAndThrowDemo {

    public static void main(String[] args) throws NegativeRadiusException{
        
        double radius=0.0,area=0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius of Circle: ");
        radius = sc.nextDouble();

        if(radius<0){
        sc.close();
        throw new NegativeRadiusException();
        }
        else{
            area=3.14*radius*radius;
            System.out.println("Area Of Circle is "+area);
        }   
        sc.close();
    }
    
}