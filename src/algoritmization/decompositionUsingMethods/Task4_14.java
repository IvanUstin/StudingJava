package algoritmization.decompositionUsingMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Натуральное число, в записи которого n цифр,
 называется числом Армстронга, если сумма его цифр,
  возведенная в степень n, равна самому числу.
   Найти все числа Армстронга от 1 до k.
   Для решения задачи использовать декомпозицию.
 */
public class Task4_14 {
    public static void main(String[] args) {
        System.out.println(DecompositionMethods.armstrongNumbers(1000000));
    }
}
