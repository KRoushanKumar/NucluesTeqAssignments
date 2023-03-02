import java.util.Scanner;
public class IntrestCal {

    public static void main(String[] args) 
    {
        int p,n;
        double r;
        double CI,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle value :");
        p=sc.nextInt();
        
        System.out.println("Enter the rate :");
        r=sc.nextDouble();
        
        System.out.println("Enter the time(in years) : ");
        n=sc.nextInt();
        
        System.out.println("Simple Interest = " + (p*r*n)/100);
	    
        System.out.println("Enter principal value = ");
        p=sc.nextInt();
        
        System.out.println("Enter time :");
        t=sc.nextDouble();
        
        System.out.println("Enter rate :");
        r=sc.nextDouble();
        
        CI = (p*(Math.pow((1+r/100) ,t)) -p);
        System.out.println("Compound Interest = " +CI);

    }
    
}