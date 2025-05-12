package firstSteps.strings.stringBuilder;
import java.util.Scanner;
public class stringBuilder1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.trim();
        String[] words = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++){
            if (words[i].indexOf("z") > -1) {
                words[i]="ERROR";
            }
            if (i == words.length-1){
                sb.append(words[i]);
            } else {
                sb.append(words[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
