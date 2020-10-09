package firstTask;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {

        System.out.print("Hello! Enter variable a: ");

        Scanner s = new Scanner(System.in);
        double a, b, c, z;

        a = s.nextDouble();

        System.out.print("\nOk. Now enter variable b: ");
        b = s.nextDouble();

        System.out.print("\nFinally, let's enter c: ");
        c = s.nextDouble();

        if((a == 3 && b == 2 && c == 1) || (a == 1 && b == 2 && c == 3))
            System.out.println("\nSo, could you think of " +
                "something more original?) ");

        z = ( (a - 3) * b / 2 ) + c;
        System.out.println("\nz = " + z);
    }
}
