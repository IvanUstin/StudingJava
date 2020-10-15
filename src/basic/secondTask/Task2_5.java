package basic.secondTask;

import java.util.Scanner;

/* Вычислить значение функции

 */
public class Task2_5 {
    public static void main(String[] args) {
        System.out.println("Enter X: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        if (x <= 3) System.out.println(Math.pow(x,2) - 3*x + 9);
        else System.out.println(1 / (Math.pow(x,3) + 6));
    }
}
