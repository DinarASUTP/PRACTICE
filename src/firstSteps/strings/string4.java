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
        str.getChars(0,str.length(),char[] dst, );
        return result;
    }
}
