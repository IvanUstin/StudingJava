package algoritmization.oneDimendtionalArrays;

import java.util.Arrays;

/*Даны действительные числа а1 ,а2 ,..., аn .
Поменять местами наибольший и наименьший элементы.
 */
public class Task1_4 {
    public static void main(String[] args) {

        //Enter numbers
        ArrayFields array =  MethodsFirstTask.createSmartDoubleArray(10,0,10);

        //change
        MethodsFirstTask.swap(array.getDoubleArray(),array.getMin(),array.getMax());

        //output the result
        System.out.println(Arrays.toString(array.getDoubleArray()));
    }
}
