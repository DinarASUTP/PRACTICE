package firstSteps.strings;
import java.util.Scanner;
public class string4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (isGMailAddress(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static boolean isGMailAddress(String str){
        boolean result = false;
        String str1 = str.substring(str.length()-10,str.length());
        String str2 = str.substring(0,str.length()-10);
        result = (str1.equals("@gmail.com")) & (!str2.isEmpty()) & (!str2.contains("@"));
        return result;
    }
}
