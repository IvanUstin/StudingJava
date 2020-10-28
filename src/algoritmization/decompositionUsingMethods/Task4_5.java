package algoritmization.decompositionUsingMethods;

import algoritmization.arraysOfArrays.MatrixMethods;

/*Составить программу, которая в массиве A[N]
находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива,
но больше всех других элементов).
 */
public class Task4_5 {
    public static void main(String[] args) {

        Integer[] array = {1,5,3,4,0,7,6};
        System.out.println(DecompositionMethods.penultimateMaxElement(array));
    }
}
