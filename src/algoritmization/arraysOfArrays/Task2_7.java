package algoritmization.arraysOfArrays;

/* Сформировать квадратную матрицу порядка N по правилу:

 */
public class Task2_7 {
    public static void main(String[] args) {

        //Required matrix:
        Matrix<Double> sinMatrix = MatrixMethods.newSinMatrix(6);
        System.out.println(sinMatrix);
        System.out.println("quantity of positive elements are " + sinMatrix.getCount());
    }
}
