package firstSteps.strings.stringBuilder;
import java.util.Scanner;
public class stringBuilder2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.trim();
        String[] words = str.split(" +");
        String[] words1 = new String[words.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words1.length; i++){
            for (int j = 1; j < words.length; j++){
                if (words[i].substring(words[i].length()-1,words[i].length()).equalsIgnoreCase(words[j].substring(0,1))){
                    words1[i+1] = words[j];
                }
            }
            if (i == words1.length-1){
                sb.append(words1[i]);
            } else {
                sb.append(words1[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
