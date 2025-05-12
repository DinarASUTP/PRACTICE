package firstSteps.strings;
import java.util.Scanner;
public class string5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(delCom(str));
    }

    public static String delCom(String str){
        String result = "";
        String str1 = str.substring(str.length()-4,str.length());
        if (str1.equals(".com")) {
            result = str.substring(0,str.length()-4);
        } else {
            result = str;
        }

        return result;
    }
}
