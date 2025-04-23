package firstSteps.arrays;
import java.util.Random;
import java.util.Scanner;
public class array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gen = sc.nextInt();
        Random r = new Random(gen);
        int[][] mas = new int[a][b];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = r.nextInt(-10,11);
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int[] mas1 = new int[b];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j]>0) {
                    mas1[j] = mas1[j] + mas[i][j];
                }
            }
        }
        for (int i = 0; i < mas1.length; i++) {
            System.out.print(mas1[i] + " ");
        }
    }
}