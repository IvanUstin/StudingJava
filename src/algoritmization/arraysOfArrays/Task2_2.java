package algoritmization.arraysOfArrays;

/*Дана квадратная матрица. Вывести на экран элементы,
стоящие на диагонали.
 */
public class Task2_2 {
    public static void main(String[] args) {

        //New matrix
        Matrix<Integer> integerMatrix = new Matrix<>();
        integerMatrix.setMatrix(MatrixMethods.newIntegerMatrix(5,5, 0, 10));
        System.out.println(integerMatrix);

        //row of diagonal elements of the matrix
        try {
            System.out.println(integerMatrix.diagonalElements(true));
        } catch (NotSquareMatrixException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
