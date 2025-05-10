package firstSteps.strings;
import java.util.Scanner;
public class string3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();
        String subStr1 = str1.substring(str1.indexOf(";")+1,str1.lastIndexOf(";"));
        String subStr2 = str2.substring(str2.indexOf(";")+1,str2.lastIndexOf(";"));
        String subStr3 = str3.substring(str3.indexOf(";")+1,str3.lastIndexOf(";"));
        System.out.println(subStr1+subStr2+subStr3);
    }
}
