package arraysOfArrays;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Task2_4 {
    public static void main(String[] args) {

        //Condition matrix
        Matrix<Integer> reverseMatrix = new Matrix<>();
        try {
            reverseMatrix.setMatrix(MatrixMethods.newReverseMatrix(6));
        } catch (N_MustBeEvenException e) {
            e.printStackTrace();
        }

        //Show it
        System.out.println(reverseMatrix);
    }
}
