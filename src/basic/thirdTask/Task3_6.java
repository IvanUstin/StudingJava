package basic.thirdTask;

import java.util.Scanner;

/*Для каждого натурального числа в промежутке от m до n вывести все делители,
кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */
public class Task3_6 {
    public static void main(String[] args) {

        System.out.println("Enter down boarder:");

        Scanner scanner = new Scanner(System.in);
        int m = (int) Math.round(scanner.nextDouble());

        System.out.println("Enter top boarder:");
        int n = (int) scanner.nextDouble();

        for (; m <= n; m++) {
            System.out.print(m + " ");
            for (int j = 2; j < m; j++) {
                if (m % j == 0) System.out.print(j + " " );
            }
            System.out.println();
        }
    }
}
