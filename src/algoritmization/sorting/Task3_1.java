package algoritmization.sorting;

import algoritmization.oneDimendtionalArrays.MethodsFirstTask;

import java.util.Arrays;
import java.util.Scanner;

/*Заданы два одномерных массива с различным количеством
элементов и натуральное число k. Объединить их в один массив,
включив второй массив между k-м и (k+1) - м элементами первого,
при этом не используя дополнительный массив.
 */
public class Task3_1 {
    public static void main(String[] args) {

        //input two matrix
        int[] firstArray = MethodsFirstTask.createIntArray(4,0,10);
        int[] secondArray = MethodsFirstTask.createIntArray(6,0,10);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter k in range from 0 to %s\n",firstArray.length-2);
        int separator = scanner.nextInt();
        while (separator < 0 || separator > firstArray.length-2) {
            System.out.println("out of range, try again:");
            separator = scanner.nextInt();
        }

//        firstArray = MethodsFirstTask.insertArray(separator,firstArray,secondArray);

        System.out.println(Arrays.toString(firstArray));
    }
}
