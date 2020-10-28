package algoritmization.arraysOfArrays;

import java.util.Scanner;

/*В числовой матрице поменять местами два столбца любых столбца,
 т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
 а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
 */
public class Task2_8 {
    public static void main(String[] args) {

        int number_of_columns = 10;

        //show the next matrix
        Matrix<Integer> matrix = new Matrix<>();
        matrix.setMatrix(MatrixMethods.newIntegerMatrix(3,number_of_columns,0,10));
        System.out.println(matrix);

        //request column's index of the matrix, which will be swapped
        System.out.println("Which column should we change?");
        Scanner input = new Scanner(System.in);
        int firstColumn = input.nextInt();

        while (firstColumn > number_of_columns || firstColumn < 1) {
            System.out.println("wrong input, the quantity of columns is " + number_of_columns + ". try again");
            firstColumn = input.nextInt();
        }

        System.out.println("to which one will we change?");
        int secondColumn = input.nextInt();

        while (secondColumn > number_of_columns || secondColumn < 1) {
            System.out.println("wrong input, the quantity of rows is " + number_of_columns + ". try again");
            secondColumn = input.nextInt();
        }

        //logic
        matrix.setMatrix(MatrixMethods.swap(matrix.getMatrix(),firstColumn - 1,secondColumn - 1));
        System.out.println(matrix);

    }
}
