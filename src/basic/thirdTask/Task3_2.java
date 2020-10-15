package basic.thirdTask;

import java.util.Scanner;

/*Вычислить значения функции на отрезке [а,b] c шагом h:

 */
public class Task3_2 {
    public static void main(String[] args) {
        System.out.println("Enter down border of range:");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        System.out.println("Enter top border of range:");
        double b = scanner.nextDouble();

        System.out.println("Set the step:");
        double h = scanner.nextDouble();

        while (a <= b) {
            System.out.println("x = " + a + "; y = " + ( a > 2 ? a : -a) );
            a += h;
        }
    }
}
