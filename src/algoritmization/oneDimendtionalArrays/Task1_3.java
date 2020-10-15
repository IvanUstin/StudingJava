package algoritmization.oneDimendtionalArrays;

import java.util.Arrays;
import java.util.Scanner;

/*Дан массив действительных чисел, размерность которого N.
Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */
public class Task1_3 {
    public static void main(String[] args) {
        // Enter N
        System.out.println("Enter N:");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        //Create an array with N's size
        double[] array = MethodsFirstTask.someArrayRound(N,-1,1);

        System.out.println(Arrays.toString(array));

        //Quantity of positive numbers
        System.out.println("Positive: " + MethodsFirstTask.quantityOfPositive(array));

        //Quantity of zero
        System.out.println("Zero: " + MethodsFirstTask.quantityOfZero(array));

        //Quantity of negative numbers
        System.out.println("Negative: " + MethodsFirstTask.quantityOfNegative(array));
    }
}
