package firstSteps.strings;
import java.util.Scanner;
public class string8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str=str.trim();
        String[] words = str.split(" +");
        String result = "";
        String str1 = "";
        for (int i = 0; i < words.length; i++){
            str1 = words[i].substring(0,1);
            str1= str1.toUpperCase();

            result += words[i];
            result += " ";
        }
        System.out.println(result);
    }
}
