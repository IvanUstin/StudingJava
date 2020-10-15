package thirdTask;

import java.util.Scanner;

/*Даны два числа. Определить цифры,
входящие в запись как первого так и второго числа.
 */
public class Task3_7 {
    public static void main(String[] args) {

        System.out.println("Enter first number:");
        Scanner scanner = new Scanner(System.in);
        String number1 = scanner.next();

        System.out.println("Enter second number:");
        String number2 = scanner.next();

        char[] N1 = number1.toCharArray();
        char[] N2 = number2.toCharArray();

        for (char i = '0'; i <= '9'; i++) {
            for (char c : N1) {
                if (c == i) {
                    for (char value : N2) {
                        if (value == i) System.out.println(i);
                    }
                    break;
                }
            }
        }
    }
}
