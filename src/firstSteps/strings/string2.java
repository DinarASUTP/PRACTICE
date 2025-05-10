package firstSteps.strings;
import java.util.Scanner;
public class string2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        System.out.println(str1.replace(";",".,"));
    }
}
