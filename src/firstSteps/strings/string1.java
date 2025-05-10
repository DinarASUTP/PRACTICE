package firstSteps.strings;
import java.util.Scanner;
import java.util.Arrays;
public class string1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();
        String[] mas = {str1,str2,str3};
        Arrays.sort(mas);
        for (int i = 0; i < mas.length; i++){
            System.out.println(mas[i]);
        }
    }
}