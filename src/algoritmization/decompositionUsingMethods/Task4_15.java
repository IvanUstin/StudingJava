package algoritmization.decompositionUsingMethods;

import java.util.List;

/*Найти все натуральные n-значные числа,
 цифры в которых образуют строго возрастающую последовательность
 (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */
public class Task4_15 {
    public static void main(String[] args) {
        List<Integer> ascendingDigits = DecompositionMethods.ascendingDigits(1);
        System.out.println(ascendingDigits);

        System.out.println(ascendingDigits.size());
        /* the dependence of the quantity of numbers on the number of digits:
        2 - 36
        3 - 84
        4 - 126
        5 - 126
        6 - 84
        7 - 36
        8 - 9
        9 - 1
         */
    }
}
