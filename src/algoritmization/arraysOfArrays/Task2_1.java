package algoritmization.arraysOfArrays;

/* Дана матрица. Вывести на экран все нечетные столбцы,
 у которых первый элемент больше последнего.
 */
public class Task2_1 {
    public static void main(String[] args) {
        Matrix<Integer> integerMatrix = new Matrix<>();
        integerMatrix.setMatrix(MatrixMethods.newIntegerMatrix(3,10, 0, 10));
        System.out.println(integerMatrix);
        System.out.println(integerMatrix.oddColumns());
    }
}
