package algoritmization.oneDimendtionalArrays;

import java.util.Arrays;
import java.util.Scanner;

/*Дана последовательность целых чисел а1 ,а2 ,..., аn.
Образовать новую последовательность,
выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).
 */
public class Task1_8 {
    public static void main(String[] args) {

        //Create an int array
        int[] array = MethodsFirstTask.createIntArray(10,0,10);

        //delete min elements
        int min = MethodsFirstTask.minOfArray(array);
        array = MethodsFirstTask.deleteElements(min,array);

        //output
        System.out.println(Arrays.toString(array));
    }
}
