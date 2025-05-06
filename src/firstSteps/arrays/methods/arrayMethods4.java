package firstSteps.arrays.methods;
import java.util.Random;
import java.util.Scanner;

public class arrayMethods4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        int ind = scan.nextInt();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        mas = deleteRow(mas, ind);
        printArray(mas);
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
    public static int[][] deleteRow (int mas[][], int ind){
        if (ind < 0 || ind >= mas.length){
            return mas;
        }
        int a[][] =  new int [mas.length-1][mas[0].length];

        for (int i = 0; i < ind; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                a[i][j] = mas[i][j];
            }
        }
        for (int i = ind; i < a.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                a[i][j] = mas[i+1][j];
            }
        }
        return a;
    }
}
