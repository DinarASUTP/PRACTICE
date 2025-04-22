package firstSteps.arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int gen = sc.nextInt();
        Random r = new Random(gen);
        double[] a = new double[l];
        double min = 0;
        double max = 0;
        for (int i = 0; i <a.length ; i++) {
            a[i] = r.nextDouble(0, 2);
            if (a[i]>max){
                max = a[i];
            }
            if ((a[i]<min)|(min==0)){
                min = a[i];
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(max+min);
    }
}
