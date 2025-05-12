package firstSteps.strings;
import java.util.Scanner;
public class string6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str=str.trim();
        String[] words = str.split(" +");
        String max = "";
        for (int i = 0; i < words.length; i++){
            if (i == 0){
                max = words[i];
            }
            if (words[i].length() > max.length()){
                max = words[i];
            }
        }
        System.out.println(max);
    }
}
