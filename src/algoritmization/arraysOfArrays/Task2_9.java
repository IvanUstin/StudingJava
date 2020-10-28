package algoritmization.arraysOfArrays;

/*Задана матрица неотрицательных чисел. Посчитать сумму элементов
в каждом столбце. Определить, какой столбец содержит максимальную сумму.
 */
public class Task2_9 {
    public static void main(String[] args) {

        int numberOfColumns = 10;
        //next matrix:
        Matrix<Integer> matrix = new Matrix<>();
        matrix.setMatrix(MatrixMethods.newIntegerMatrix(4,numberOfColumns,0,10));
        System.out.println(matrix);

        //Logic
        //code below exists to use "toString" method of class Matrix for more beautiful output
        Matrix<Integer> sumMatrix = new Matrix<>();
        sumMatrix.setMatrix(MatrixMethods.newIntegerMatrix(1,numberOfColumns,0,0));
        Integer[][] rowSumMatrix = sumMatrix.getMatrix();
        rowSumMatrix[0] = MatrixMethods.sumOfColumnElementsWithMax(matrix);
        System.out.println("Sum:");
        System.out.println(sumMatrix);
        System.out.println("The " + (matrix.getSet().size() > 1 ? "columns" : "column")
                + " of max sum of elements is " + matrix.getSet());
    }
}
