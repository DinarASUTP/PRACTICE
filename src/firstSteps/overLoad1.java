package firstSteps;
import java.util.Scanner;
public class overLoad1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num == 1) {
            double a = scan.nextDouble();
            System.out.printf("%.2f",square(a));
        } else if (num == 2) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            System.out.printf("%.2f",square(a, b));
        }
    }
    static double square(double a, double b){
        double result = 0;
        result = a * b;
        return result;
    }
    static double square(double a){
        double result = 0;
        result = a *a;
        return result;
    }
}