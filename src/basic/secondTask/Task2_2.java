package basic.secondTask;

import java.util.Scanner;

/*Найти max{min(a, b), min(c, d)}.
 */
public class Task2_2 {
    public static void main(String[] args) {

        System.out.println("Enter four numbers through a space:");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] array = s.split(" ");

        double a = Double.parseDouble(array[0]);
        double b = Double.parseDouble(array[1]);
        double c = Double.parseDouble(array[2]);
        double d = Double.parseDouble(array[3]);

        double min1 = Math.min(a,b);
        double min2 = Math.min(c,d);
        double max = Math.max(min1,min2);

        System.out.println(max);
    }
}
