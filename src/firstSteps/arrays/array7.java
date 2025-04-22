package firstSteps.arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class array7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int gen = sc.nextInt();
        Random r = new Random(gen);
        int[] a = new int[l];
        for(int i = 0; i < a.length; ++i) {
            a[i] = r.nextInt(10, 21);
        }
        System.out.println(Arrays.toString(a));
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] b = new int[y-x+1];
        for(int i = 0; i < b.length; ++i) {
            b[i] = a[i+x];
        }
        Arrays.sort(b);
        //System.out.println(Arrays.toString(b));
        for(int i = 0; i < b.length; ++i) {
            a[i+x] =b[i];
        }
        System.out.println(Arrays.toString(a));
    }
}
