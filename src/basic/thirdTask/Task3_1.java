package basic.thirdTask;

import java.util.Scanner;

/*Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.
 */
public class Task3_1 {
    public static void main(String[] args) {

        System.out.println("Enter integer positive number:");

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(sum(i));
    }

    static int sum(int i) {
        if (i == 1) return 1;
        else return i + sum(i-1);
    }
}
