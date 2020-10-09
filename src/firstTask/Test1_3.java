package firstTask;

import java.util.Scanner;

import static java.lang.Math.*;

public class Test1_3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double x, y;

        System.out.print("Hi, enter value of X's degree: ");

        x = s.nextDouble();

        System.out.print("Ok, now enter value of Y's degree: ");

        y = s.nextDouble();

        int a = (int) (x + y);
        if (a == 90 || a == 89) {
            System.out.println("Sorry, but your values are " +
                    "out of scope. Try again.");
        } else {
            x = toRadians(x);
            y = toRadians(y);
            double z = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);
            System.out.println("Result = " + z);
        }
    }
}
