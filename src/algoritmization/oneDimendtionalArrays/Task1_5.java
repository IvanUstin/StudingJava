package algoritmization.oneDimendtionalArrays;

import java.util.Scanner;

// Даны целые числа а1 ,а2 ,..., аn .
// Вывести на печать только те числа, для которых аi > i.
public class Task1_5 {
    public static void main(String[] args) {

        //Create an array
        int[] array = MethodsFirstTask.createIntArray(10,0,10);

        //Conditional output
        MethodsFirstTask.outOfSequence(array);
    }
}
