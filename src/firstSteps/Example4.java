package firstSteps;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(maxSumDigits(a, b));
    }

    static int maxSumDigits(int a, int b) {
        if (a > b) { //если диапазон не верно задан
            int tmp = a; //переставляем границы
            a = b;
            b = tmp;
        }
        int max = a;
        int maxSum = sumDigits(a); //сумма цифр первого числа диапазона
        a++; //переходим ко второму числу
        while (a <= b) { //мы внутри диапазона
            if (sumDigits(a) > maxSum) {
                max = a; //запоминаем само число
                maxSum = sumDigits(a); //и его сумму цифр
            }
            a++; //переходим к следующему числу
        }
        return max;
    }

    static int sumDigits(int a) {
        int sum = 0;
        while (a > 0){
            sum += a % 10; //последнюю цифру прибавляем к сумме
            a /= 10; //избавляемся от последней цифры
        }
        return sum;
    }
}
