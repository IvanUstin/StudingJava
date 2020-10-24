package arraysOfArrays;

/*Найдите наибольший элемент матрицы и
заменить все нечетные элементы на него.
 */
public class Task2_15 {
    public static void main(String[] args) {

        //new matrix
        Matrix<Integer> matrix = new Matrix<>(4,4,0,20);
        System.out.println(matrix);

        //logic and out
        matrix.setMatrix(MatrixMethods.changeUnevenElements(matrix.getMatrix(),matrix.getMax()));
        System.out.println(matrix);
    }
}
