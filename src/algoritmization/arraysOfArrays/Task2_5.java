package algoritmization.arraysOfArrays;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

 */
public class Task2_5 {
    public static void main(String[] args) throws N_MustBeEvenException {

        // Required matrix:
        Matrix<Integer> triangleMatrix = new Matrix<>();
        triangleMatrix.setMatrix(MatrixMethods.newTriangleMatrix(6));
        System.out.println(triangleMatrix);
    }
}
