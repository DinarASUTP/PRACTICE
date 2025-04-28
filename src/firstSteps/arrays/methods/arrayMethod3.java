package firstSteps.arrays.methods;
import java.util.Random;
import java.util.Scanner;

public class arrayMethod3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar, seed);
        print(ar);
        int[] b = reduceAfterMax(ar);
        print(b);
    }
    public static void init(int[] mas, long gen){
        Random rand = new Random(gen);
        for(int i = 0; i < mas.length; i++){
            mas[i] = rand.nextInt(-3,6);
        }
    }
    public static void print(int[] mas) {
        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
    public static int findMax(int[] mas){
        int max = 0;
        int index = 0;
        for (int i = 0;i < mas.length; i++){
            if ((i == 0) || (mas[i] > max)){
                max = mas[i];
                index = i;
            }
        }
        return index;
    }
    public  static int[] reduceAfterMax (int mas[]){
        int index = findMax(mas);
        int a[] = new int [index + 1];
        for (int i  = 0; i < index +1; i++){
            a[i] = mas[i];
        }
        return a;
    }
}
