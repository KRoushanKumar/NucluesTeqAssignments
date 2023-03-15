import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePinCodeNum {
    public static void main(String[] args) {
        String num=null;
        Scanner sc = new Scanner(System.in);
        num = sc.nextLine();
        sc.close();
        System.out.println(num+ " " +isValidPinNumber(num));
    }

    private static boolean isValidPinNumber(String pinCode) {
        String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
	        
	        Pattern p = Pattern.compile(regex);
	        
	        if (pinCode == null) {
	            return false;
	        }
	        Matcher m = p.matcher(pinCode);

	        return m.matches();
    }
}
