package firstSteps.arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gen = sc.nextInt();
        int conElem  = sc.nextInt();
        Random r = new Random(gen);
        int[] a = new int[n];
        for (int i = 0; i <a.length ; i++) {
            a[i] = r.nextInt(2, 16);
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int eqElem = -1;
        for (int i = 0; i <a.length ; i++) {
            if (a[i] == conElem){
                eqElem = i;
            }
        }
        if (eqElem < 0) {
            System.out.println("ERROR");
        }else{
            int[] b =  Arrays.copyOf(a, eqElem+1);
            System.out.println(Arrays.toString(b));
        }
    }
}
