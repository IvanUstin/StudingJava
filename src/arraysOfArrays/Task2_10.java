package arraysOfArrays;

import java.util.List;

/*Найти положительные элементы главной диагонали квадратной матрицы.

 */
public class Task2_10 {
    public static void main(String[] args) throws NotSquareMatrixException {
        //create new matrix
        Matrix<Integer> matrix = new Matrix<>();
        matrix.setMatrix(MatrixMethods.newIntegerMatrix(5,5,-9,9));
        System.out.println(matrix);
        List<Integer> diagonal = matrix.diagonalElements(true);

        //suddenly found method))
        diagonal.removeIf(x -> x <= 0);
        System.out.println(diagonal);
    }
}
