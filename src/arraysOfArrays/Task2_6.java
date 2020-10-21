package arraysOfArrays;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

 */
public class Task2_6 {
    public static void main(String[] args) throws N_MustBeEvenException {

        //Required matrix:
        Matrix<Integer> sandClock = new Matrix<>();
        sandClock.setMatrix(MatrixMethods.newSandClockMatrix(20));
        System.out.println(sandClock);
    }
}
