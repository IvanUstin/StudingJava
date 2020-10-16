package algoritmization.oneDimendtionalArrays;

import java.util.Scanner;

/*Задана последовательность N вещественных чисел.
 Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */
public class Task1_6 {
    public static void main(String[] args) {

        //Create a double array
        double[] array = MethodsFirstTask.createDoubleArray(10,0,10);

        //Conditional output
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (MethodsFirstTask.isSimple(i)) {
                sum += array[i];
                System.out.println(i + " " + array[i]);
            }
        }
        System.out.println("Sum is " + sum);
    }
}
