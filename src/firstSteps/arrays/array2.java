package firstSteps.arrays;
import java.util.Scanner;
import java.util.Random;
public class array2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int seed = scan.nextInt();
        int []a = new int[l];
        int sum = 0;
        double mux = 1;
        Random random = new Random(seed);
        for (int i = 0; i < a.length; i++){
            a[i] = random.nextInt(-5,5);
            if (a[i] > 0){
                sum+=a[i];
            }
            if (a[i] < 0){
                mux = mux * a[i];
            }
            System.out.printf("%d ",a[i]);
        }
    }
}
