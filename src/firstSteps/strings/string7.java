package firstSteps.strings;
import java.util.Scanner;
public class string7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String elim = scan.nextLine();
        str=str.trim();
        String[] words = str.split(" +");
        String result = "";
        for (int i = 0; i < words.length; i++){
            if (elim.equals(words[i]) & (elim.length() == words[i].length())){
                words[i]="";
                continue;
            }
            result += words[i];
            result += " ";
        }
        System.out.println(result);
    }
}
