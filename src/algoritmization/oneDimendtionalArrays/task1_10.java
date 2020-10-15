package algoritmization.oneDimendtionalArrays;

import java.util.Arrays;

/*Дан целочисленный массив с количеством элементов п. Сжать массив,
 выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
 */
public class task1_10 {
    public static void main(String[] args) {
        //create an int array
        int[] array = MethodsFirstTask.createIntArray(10,0,10);

        //compression
        array = MethodsFirstTask.compression(array);
        System.out.println(Arrays.toString(array));
    }
}
