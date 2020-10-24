package arraysOfArrays;

/* Отсортировать столбцы матрицы по возрастанию и убыванию

 */
public class Task2_13 {
    public static void main(String[] args) {

        //new matrix
        Matrix<Integer> matrix = new Matrix<>();
        matrix.setMatrix(MatrixMethods.newIntegerMatrix(5,5,0,9));
        System.out.println(matrix);

        MatrixMethods.sortMatrixColumns(matrix,true);
        System.out.println(matrix);

        MatrixMethods.sortMatrixColumns(matrix,false);
        System.out.println(matrix);
    }
}
