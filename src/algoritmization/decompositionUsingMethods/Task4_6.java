package algoritmization.decompositionUsingMethods;

import java.util.Arrays;

/*Написать метод(методы), проверяющий,
являются ли данные три числа взаимно простыми.
 */
public class Task4_6 {
    public static void main(String[] args) {

        /* google definition: числа взаимно просты,
        если их наибольший общий делитель (НОД) равен 1.
         */

        final int a = 13;
        final int b = 26;
        final int c = 39;

        System.out.printf("these numbers %s mutually prime",
                DecompositionMethods.mutuallyPrime(a,b,c) ? "are" : "aren't");
    }
}
