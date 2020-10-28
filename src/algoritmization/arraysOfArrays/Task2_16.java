package algoritmization.arraysOfArrays;

/*Магическим квадратом порядка n называется квадратная матрица размера nxn,
составленная из чисел 1, 2, 3, ..., так, что суммы по каждому столбцу,
каждой строке и каждой из двух больших диагоналей равны между собой.
Построить такой квадрат.
 */
public class Task2_16 {
    public static void main(String[] args) {
        Matrix<Integer> matrix = new Matrix<>();
        long lastTry = MatrixMethods.checkMagicSquare(matrix,3);
        System.out.println(matrix);
        System.out.println(lastTry);
    }
}
