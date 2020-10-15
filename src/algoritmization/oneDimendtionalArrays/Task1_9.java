package algoritmization.oneDimendtionalArrays;

/*В массиве целых чисел с количеством элементов n найти наиболее
часто встречающееся число. Если таких чисел несколько, то определить наименьшее из них.
 */
public class Task1_9 {
    public static void main(String[] args) {
        //create an int array
        int[] array = MethodsFirstTask.createIntArray(20,0,5);

        //define the most often number
        int common = MethodsFirstTask.commonNumber(array);
        System.out.println(common);
    }
}
