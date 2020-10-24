package arraysOfArrays;

/*Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

 */
public class Task2_12 {
    public static void main(String[] args) {

        //new not sorted matrix
        Matrix<Integer> matrix = new Matrix<>();
        matrix.setMatrix(MatrixMethods.newIntegerMatrix(5,5,0,5));
        System.out.println(matrix);

       matrix.setMatrix(MatrixMethods.sortMatrixRows(matrix, true));
        System.out.println(matrix);

        matrix.setMatrix(MatrixMethods.sortMatrixRows(matrix, false));
        System.out.println(matrix);
        //sorting
    }
}
