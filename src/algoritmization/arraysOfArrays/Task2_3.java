package algoritmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;

/*Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

 */
public class Task2_3 {
    public static void main(String[] args) {

        //New matrix
        int number_of_rows = 5;
        int number_of_columns = 5;
        Matrix<Integer> integerMatrix = new Matrix<>();
        integerMatrix.setMatrix(MatrixMethods.newIntegerMatrix(number_of_rows,number_of_columns, 0, 10));
        System.out.println(integerMatrix);

        //request of row's and column's index of the matrix
        System.out.println("Which column should we show?");
        Scanner input = new Scanner(System.in);
        int inputColumn = input.nextInt();

        while (inputColumn > number_of_columns || inputColumn < 1) {
            System.out.println("wrong input, the quantity of columns is " + number_of_columns + ". try again");
            inputColumn = input.nextInt();
        }

        System.out.println("Which row of the matrix would you like to see?");
        int inputRow = input.nextInt();

        while (inputRow > number_of_rows || inputRow < 1) {
            System.out.println("wrong input, the quantity of rows is " + number_of_rows + ". try again");
            inputRow = input.nextInt();
        }

        //Result
        System.out.println("the row number " + inputRow + " is " + Arrays.toString(integerMatrix.getRowOfMatrix(inputRow - 1)));
        System.out.println("the column number " + inputColumn + " is " + integerMatrix.getColumnOfMatrix(inputColumn - 1));
    }
}
