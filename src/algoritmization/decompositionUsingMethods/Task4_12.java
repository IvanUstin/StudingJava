package algoritmization.decompositionUsingMethods;

import java.util.Arrays;

/*Даны натуральные числа К и N. Написать метод(методы)
 формирования массива А, элементами которого являются
 числа, сумма цифр которых равна К и которые не большее N.
 */
public class Task4_12 {
    public static void main(String[] args) {

        double[] array = DecompositionMethods.sumOfDigitsArray(14, 59, 4);
        System.out.println(Arrays.toString(array));
    }
}
