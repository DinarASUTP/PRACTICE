package firstSteps;
import java.util.Scanner;
public class methodFirst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        char sim = scan.next().charAt(0);
        printTriangle(len, sim);
    }
    static void printTriangle(int len, char sim){
        int curHeight = 0;
        if (len%2==0){
            curHeight = 2;
        } else {
            curHeight = 1;
        }
        int curWidth = len/2+1;
        while (curWidth<=len) {
            for (int i = 0; i < curWidth - curHeight; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < curHeight; j++) {
                System.out.print(sim);
            }
            curWidth+=1;
            curHeight+=2;
            System.out.println();
        }
    }
}
