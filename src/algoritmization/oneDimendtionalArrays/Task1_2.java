package algoritmization.oneDimendtionalArrays;

import java.util.Arrays;
import java.util.Scanner;

/*Дана последовательность действительных чисел а1 ,а2 ,..., ап.
Заменить все ее члены, большие данного Z, этим числом.
 Подсчи­тать количество замен.
 */
public class Task1_2 {
    public static void main(String[] args) {

        // enter of values
        double[] input = MethodsFirstTask.createDoubleArray(10,0,10);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Z: ");
        double Z = scanner.nextDouble();

        //transformation
        double[] changeInput = MethodsFirstTask.changeToZ(Z,input);

        System.out.println("Changed array: " + Arrays.toString(changeInput));

        //output
        System.out.println("\nNumber of changes: "
                + MethodsFirstTask.quantityOfChanges(input,changeInput));
    }
}
