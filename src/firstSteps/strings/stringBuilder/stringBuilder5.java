package firstSteps.strings.stringBuilder;
import java.util.Scanner;
public class stringBuilder5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        boolean exist = false;
        if ((str.indexOf("1") != -1) | (str.indexOf("2") != -1) |(str.indexOf("3") != -1) |(str.indexOf("4") != -1) |
                (str.indexOf("5") != -1) |(str.indexOf("6") != -1) |(str.indexOf("7") != -1) |(str.indexOf("8") != -1) |
                (str.indexOf("9") != -1) | (str.indexOf("0") != -1)){
            exist = true;
        }
        if (exist) {
            for (int i = 0; i < str.length(); i++){
                int number = Character.getNumericValue(str.charAt(i));
                if ((number >= 0 ) & (number < 10 )){
                    sum = sum + number;
                    sb.append(number).append("+");
                }
            }
            sb.replace(sb.length()-1,sb.length(),"="+sum);
            System.out.println(sb);
        }else {
            System.out.println("ERROR");
        }
    }
}
