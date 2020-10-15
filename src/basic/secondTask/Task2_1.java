package basic.secondTask;

import java.util.Scanner;

/* Даны два угла треугольника (в градусах). Определить, существует ли
такой треугольник, и если да, то будет ли он прямоугольным.
 */
public class Task2_1 {
    public static void main(String[] args) {
        System.out.print("Enter two angles by degrees:\n first: ");

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        while (a >= 180 || a <= 0) {
            System.out.print("We need a flat triangle, let's do it again.\n" +
                    "first: ");
            a = scanner.nextDouble();
        }

        System.out.print("second: ");
        double b = scanner.nextDouble();

        if (b >= 180 || b <= 0) System.out.println("Life teaches nothing.");
        else if (a + b < 180) {
            System.out.println("There is a triangle with " +
                    "same angles.");
            if (a == 90 || b == 90 || a + b == 90) System.out.println("It's " +
                    "rectangular.");
        } else System.out.println("Such triangle doesn't exist.");
    }
}
