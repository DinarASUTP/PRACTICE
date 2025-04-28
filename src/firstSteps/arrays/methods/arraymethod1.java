package firstSteps.arrays.methods;

import java.util.Random;
import java.util.Scanner;

public class arraymethod1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kol = sc.nextInt();
        int gen = sc.nextInt();
        int []a = new int[kol];
        init(a,gen);
        print(a);
        System.out.println(findMax(a));
    }
    public static void init(int[] mas, int gen){
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
}

