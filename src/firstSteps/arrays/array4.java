package firstSteps.arrays;
import java.util.Scanner;
import java.util.Random;
public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gen = sc.nextInt();
        Random r = new Random(gen);
        int[] a = new int[n];
        for (int i = 0; i <a.length ; i++) {
            a[i] = r.nextInt(-5, 16);
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int min = a[0];
        int minInd = 0;
        int max = a[0];
        int imax = 0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]>=max){
                max = a[i];
                imax = i;
            }
            if(a[i]<0){
                min = a[i];
                minInd = i;
            }
        }
        int tmp = a[minInd];
        a[minInd]=a[imax];
        a[imax] = tmp;
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
