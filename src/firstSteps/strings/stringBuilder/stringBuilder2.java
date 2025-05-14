package firstSteps.strings.stringBuilder;
import java.util.Scanner;
public class stringBuilder2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.trim();
        String[] words = str.split(" +");
        StringBuilder sb = new StringBuilder();
        String wordEnds ="";
        String wordStarts ="";
        for (int i = 0; i < words.length-1; i++){
            metka:
            for (int j = i+1; j < words.length; j++){
                wordEnds = words[i].substring(words[i].length()-1,words[i].length());
                wordStarts = words[j].substring(0,1);
                if (wordEnds.equalsIgnoreCase(wordStarts)){
                    String tmpStr = words[j];
                    words[j] =  words[i+1];
                    words[i+1] = tmpStr;
                    break metka;
                }
            }
        }
        for (int i = 0; i < words.length; i++){
            if (i == words.length-1){
                sb.append(words[i]);
            } else {
                sb.append(words[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
