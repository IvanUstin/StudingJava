package basic.secondTask;

import java.util.Scanner;

/*Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
 Определить, будут ли они расположены на одной прямой.
 */
public class Task2_3 {
    public static void main(String[] args) {
        System.out.print("Enter x1: ");
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();


        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();


        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();


        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();


        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        if ((x3 - x1)/(x2 - x1) == (y3 - y1)/(y2 - y1))
            System.out.println("Dots lie on the same line.");
        else System.out.println("Dots don't lie on the same line.");
    }
}
