package firstSteps.arrays.methods;

import java.util.Random;
import java.util.Scanner;


public class arrayMethod2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        printMaxIndex(mas);
    }
    public static void initArray(int[][] mas, long gen){
        Random rand = new Random(gen);
        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas[i].length; j++){
                mas[i][j] = rand.nextInt(0,11);
            }
        }
    }
    public static void printArray(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void printMaxIndex(int[][] mas){
        int index = 0;
        int a[] = new int[mas[1].length];
        for (int i = 0;i < mas.length; i++){
            for (int j = 0; j < mas[i].length; j++) {
                a[j] = mas[i][j];
            }
            System.out.print(findMax(a) + " ");
        }
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
}
