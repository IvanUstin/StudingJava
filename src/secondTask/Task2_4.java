package secondTask;

import java.util.Scanner;
import static java.lang.Math.*;
/*Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 Определить, пройдет ли кирпич через отверстие.
 */
public class Task2_4 {
    public static void main(String[] args) {
        System.out.println("Enter a:");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        System.out.println("Enter b:");
        double b = scanner.nextDouble();

        System.out.println("Enter brick sides trough space:");
        scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] array = s.split(" ");

        double x = Double.parseDouble(array[0]);
        double y = Double.parseDouble(array[1]);
        double z = Double.parseDouble(array[2]);

        if (min(x,min(y,z)) <= min(a,b)
                &&
                x + y + z - min(x,min(y,z)) - max(x,max(y,z)) <= max(a,b))
            System.out.println("It goes trough.");
        else System.out.println("It can't go trough.");
    }
}
