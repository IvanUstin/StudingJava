package thirdTask;

import java.util.Scanner;

/*Вывести на экран соответствий
 между символами и их численными обозначениями в памяти компьютера.
 */
public class Task3_5 {
    public static void main(String[] args) {
        System.out.println("Enter one symbol.");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        s = s.trim();
        char c = s.charAt(0);
        int a = c;
        System.out.println("Number of this symbol is " + a);
    }
}
