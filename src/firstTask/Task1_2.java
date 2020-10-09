package firstTask;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task1_2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double a, b, c, z;

        System.out.print("Hello! Enter variable a: ");
        a = s.nextDouble();

        do {
            if (a == 0) {
                System.out.println(" a mustn't be 0, choose another value: ");
                a = s.nextDouble();
            }
        } while (a == 0);

        System.out.print("\nOk. Now enter variable b: ");
        b = s.nextDouble();

        System.out.print("\nFinally, let's enter c: ");
        c = s.nextDouble();

        if (pow(b, 2) + 4 * a * c < 0) {
            System.out.println("Sorry, but your values are " +
                    "out of scope. Try again.");
        } else {
            if ((a == 3 && b == 2 && c == 1) || (a == 1 && b == 2 && c == 3))
                System.out.println("\nSo, could you think of " +
                        "something more original?) ");

            z = (b + sqrt((pow(b, 2) + 4 * a * c))) / (a * 2) - (pow(a, 3) * c) + pow(b, -2);
            System.out.println("\nz = " + z);
            System.out.println();

        }
    }
}
