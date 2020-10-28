package algoritmization.decompositionUsingMethods;

import java.util.Arrays;

/*Дано натуральное число N. Написать метод(методы) для
формирования массива, элементами которого являются цифры числа N.
 */
public class Task4_10 {
    public static void main(String[] args) {

        final int i = 12345;
        System.out.println(Arrays.toString(DecompositionMethods.digitsOfNumber(i)));
    }
}
