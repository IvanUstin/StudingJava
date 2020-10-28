package algoritmization.arraysOfArrays;

import java.util.Set;

/*Матрицу 10x20 заполнить случайными числами от 0 до 15.
Вывести на экран саму матрицу и номера строк,
 в которых число 5 встречается три и более раз.
 */
public class Task2_11 {
    public static void main(String[] args) {

        //required matrix
        Matrix<Integer> matrix = new Matrix<>();
        matrix.setMatrix(MatrixMethods.newIntegerMatrix(5,4,4,5));
        System.out.println(matrix);

        //logic
        Set<Integer> rows = MatrixMethods.specialRows(matrix,5,3);
        System.out.printf(rows.isEmpty() ? "No matches" : "The required rows are %s",rows);
    }
}
