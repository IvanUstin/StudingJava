package algoritmization.arraysOfArrays;

/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
причем в каждом столбце число единиц равно номеру столбца.
 */
public class Task2_14 {
    public static void main(String[] args) {

        //Condition matrix
        Matrix<Integer> matrix = new Matrix<>();
        matrix.setMatrix(MatrixMethods.newBinaryMatrix(5,5));
        System.out.println(matrix);
    }
}
