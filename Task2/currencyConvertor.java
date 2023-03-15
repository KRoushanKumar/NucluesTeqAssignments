import java.text.DecimalFormat;
import java.util.Scanner;

public class currencyConvertor {
    public static void main(String[] args) {
        
        int ch=0;
        double rupee, dollar, pound, euro,amount;
        DecimalFormat f = new DecimalFormat("#.#");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Ruppee");
        System.out.println("2. Doller");
        System.out.println("3. Euro");
        System.out.println("4. Pound");
        
        ch = sc.nextInt();
        System.out.println("Enter the amount: ");
        amount = sc.nextDouble();
        switch(ch)
        {
            case 1:

                dollar = amount / 70;
                System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");

                pound = amount / 88;
                System.out.println(amount + " Rupee = " + f.format(pound) + " Pound");

                euro = amount / 80;
                System.out.println(amount + " Rupee = " + f.format(euro) + " Euro");
            
                break;
            
            case 2:
                rupee = amount * 70;
                System.out.println(amount + " Dollar = " + f.format(rupee) + " Rupees");

                pound = amount *0.78;
                System.out.println(amount + " Dollar = " + f.format(pound) + " Pound");

                euro = amount *0.87;
                System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");
            
            break;

            case 3:

            rupee = amount * 80;
            System.out.println(amount + " euro = " + f.format(rupee) + " Rupees");

            dollar = amount *1.14;
            System.out.println(amount + " euro = " + f.format(dollar) + " Dollar");

            pound = amount *0.90;
            System.out.println(amount + " euro = " + f.format(pound) + " Pound");
            
            break;
            
            case 4:
                rupee = amount * 88;
                System.out.println(amount + " pound = " + f.format(rupee) + " Rupees");

                dollar = amount *1.26;
                System.out.println(amount + " pound = " + f.format(dollar) + " Dollar");

                euro = amount *1.10;
                System.out.println(amount + " pound = " + f.format(euro) + " Euro");
            break;
            

            default:
            break;
        }


    }
}
