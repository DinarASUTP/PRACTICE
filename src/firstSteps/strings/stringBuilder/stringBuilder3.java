package firstSteps.strings.stringBuilder;
import java.util.Scanner;
public class stringBuilder3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] words = str.split(" +");
        StringBuilder sb = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            char simb = sb.charAt(sb.length() - 1);
            for (int j = 1; j < words.length; j++) {
                if(words[j].charAt(0) == simb){
                    sb.append(" ").append(words[j]);
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
