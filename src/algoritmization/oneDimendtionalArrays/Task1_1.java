package algoritmization.oneDimendtionalArrays;

import java.util.Scanner;

/*В массив A [N] занесены натуральные числа.
Найти сумму тех элементов, которые кратны данному К.
 */
public class Task1_1 {
    public static void main(String[] args) {

        //input
        int[] array = MethodsFirstTask.createIntArray(10,0,10);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of divider");
        int divider = scanner.nextInt();

        //output
        System.out.println("The sum is "
                + MethodsFirstTask.sumOfMultipleNumbers(divider,array));
    }
}
