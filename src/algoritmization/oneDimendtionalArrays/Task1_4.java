package algoritmization.oneDimendtionalArrays;

import java.util.Arrays;

/*Даны действительные числа а1 ,а2 ,..., аn .
Поменять местами наибольший и наименьший элементы.
 */
public class Task1_4 {
    public static void main(String[] args) {

        //Enter numbers
        ArrayFields arrayFields = new ArrayFields();
        double[] array = MethodsFirstTask.createSmartDoubleArray(10,0,10, arrayFields);

        //change
        MethodsFirstTask.swap(array,arrayFields.min,arrayFields.max);

        //output the result
        System.out.println(Arrays.toString(array));
    }
}
