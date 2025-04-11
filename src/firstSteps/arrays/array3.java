package firstSteps.arrays;
import java.util.Scanner;
public class array3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int  []a = new int[l];
        int min = 0;
        for (int i = 0; i < a.length; i++){
            a[i] = scan.nextInt();
        }
        min = a[0];
        int minInd = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i]<=min){
                min = a[i];
                minInd = i;
            }
        }
        a[minInd]=-1;
        System.out.println();
        for (int i = 0; i < a.length; i++){
            System.out.printf("%d ",a[i]);
        }
    }
}
