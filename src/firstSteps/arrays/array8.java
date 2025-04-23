package firstSteps.arrays;
import java.util.Random;
import java.util.Scanner;
public class array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gen = sc.nextInt();
        Random r = new Random(gen);
        int[][] mas = new int[a][b];
        int max = 0;
        int counter = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = r.nextInt(-5,5);
                System.out.print(mas[i][j] + "\t");
                if (mas[i][j] > max) {
                    max = mas[i][j];
                }
            }
            System.out.println();
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == max) {
                    counter = counter + 1;
                }
            }
        }
        System.out.printf("%d %d",max, counter);
    }
}
