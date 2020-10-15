package algoritmization.oneDimendtionalArrays;

import java.util.Arrays;

/*Даны действительные числа а1 ,а2 ,..., аn .
Поменять местами наибольший и наименьший элементы.
 */
public class Task1_4 {
    public static void main(String[] args) {

        //Enter numbers
        double[] array = MethodsFirstTask.createDoubleArray(10,0,10);

        //change
        double max = MethodsFirstTask.maxOfArray(array);
        double min = MethodsFirstTask.minOfArray(array);
        MethodsFirstTask.swap(array,min,max);

        //output the result
        System.out.println(Arrays.toString(args));
    }
}
