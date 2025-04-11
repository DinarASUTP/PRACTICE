package firstSteps.arrays;
import java.util.Scanner;
import java.util.Random;

public class array1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int seed = scan.nextInt();
        double []a = new double[l];
        double sum = 0;
        double mux = 1;
        Random random = new Random(seed);
        for (int i = 0; i < a.length; i++){
            a[i] = random.nextDouble(0,5);
            sum+=a[i];
            System.out.printf("%.2f ",a[i]);
        }
        System.out.println();
        double srAref = sum / l;
        System.out.printf("%.2f\n",srAref);
        for (int i = 0; i < a.length; i++){
            if (a[i]>srAref){
                a[i]=srAref;
            }
            System.out.printf("%.2f ",a[i]);
        }
    }
}
