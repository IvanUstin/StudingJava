package algoritmization.decompositionUsingMethods;

import java.math.BigDecimal;

/* Написать программу, определяющую сумму n - значных чисел,
содержащих только нечетные цифры. Определить также,
сколько четных цифр в найденной сумме.
Для решения задачи использовать декомпозицию.
 */
public class Task4_16 {
    public static void main(String[] args) {
        final int numberOfDigits = 10;
        BigDecimal sum = DecompositionMethods.sumOfNumbersWithUnevenDigits(numberOfDigits);
        System.out.printf("The sum of the %d bitness numbers is %s\nand the quantity of even digits of the number of sum is %d",
                numberOfDigits,sum.toString(),DecompositionMethods.quantityOfEvenDigits(sum));
    }
}
