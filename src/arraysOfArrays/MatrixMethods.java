package arraysOfArrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class MatrixMethods {

    //create an int matrix
    public static int[][] newIntMatrix(int N, int min, int max) {
        int[][] matrix = new int[N][N];
        for (int[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                row[i] = (int) (Math.random() * (max - min + 1) + min);
            }
        }
        return matrix;
    }

    //create an Integer matrix
    public static Integer[][] newIntegerMatrix(int rows, int columns, int min, int max) {
        Integer[][] matrix = new Integer[rows][columns];
        for (Integer[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                row[i] = (int) (Math.random() * (max - min + 1) + min);
            }
        }
        return matrix;
    }

    //create an Integer matrix in accordance with the condition of the fours task
    public static Integer[][] newReverseMatrix(int N) throws N_MustBeEvenException{
        if (N % 2 != 0) {
            throw new N_MustBeEvenException("N must be even");
        }
        Integer[][] matrix = new Integer[N][N];
        for (int i = 1; i < N; i += 2) {
            for (int j = 0; j < N; j++) {
                matrix[i - 1][j] = j + 1;
                matrix[i][j] = N - j;
            }
        }
        return matrix;
    }

    //create an Integer matrix in accordance with the condition of the fifth task
    public static Integer[][] newTriangleMatrix(int N) throws N_MustBeEvenException{
        if (N % 2 != 0) {
            throw new N_MustBeEvenException("N must be even");
        }
        Integer[][] matrix = new Integer[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = j < N - i ? (i + 1) : 0;
            }
        }
        return matrix;
    }

    //create an Integer matrix in accordance with the condition of the six task
    public static Integer[][] newSandClockMatrix(int N) throws N_MustBeEvenException{
        if (N % 2 != 0) {
            throw new N_MustBeEvenException("N must be even");
        }
        Integer[][] matrix = new Integer[N][N];
        for (int i = 0; i < N; i++) {
            if (i < N / 2) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = ((j >= i) && (j < N - i)) ?  1 : 0;
                }
            } else {
                matrix[i] = matrix[N - i - 1];
            }
        }
        return matrix;
    }

    //create an Double matrix in accordance with the condition of the seventh task
    public static Matrix<Double> newSinMatrix(int N) {

        Double[][] matrix = new Double[N][N];
        int positiveCount = 0;

        BigDecimal bd = new BigDecimal(0);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                bd = bd.valueOf(Math.sin((Math.pow(i,2) - Math.pow(j,2)) / N));
                bd = bd.setScale(4, RoundingMode.HALF_UP);
                matrix[i][j] = bd.doubleValue();
                if (matrix[i][j] > 0) positiveCount++;
            }
        }

        Matrix<Double> newMatrix = new Matrix<>();
        newMatrix.setMatrix(matrix);
        newMatrix.setCount(positiveCount);

        return newMatrix;
    }

    //create an Double matrix
    public static Double[][] newDoubleMatrix(int N, int min, int max) {
        Double[][] matrix = new Double[N][N];
        for (Double[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                row[i] = Math.random() * (max - min + 1) + min;
            }
        }
        return matrix;
    }

    //create a matrix of collection
    public static List<ArrayList> newListMatrix(int N, int min, int max, boolean isInt) {
        List<ArrayList> matrix = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ArrayList nextRow = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                nextRow.add(isInt ? (Integer)((int)(Math.random() * (max - min + 1) + min)) : ((Double)(Math.random() * (max - min + 1) + min)));
            }
            matrix.add(nextRow);
        }
        return matrix;
    }

    //swap columns of matrix
    public static <T extends Number> T[][] swap (T[][] inputMatrix, int firstColumn, int secondColumn) {
        T[][] matrix = inputMatrix.clone();
        for (int i = 0; i < matrix.length; i++) {
            T t = matrix[i][secondColumn];
            matrix[i][secondColumn] = matrix[i][firstColumn];
            matrix[i][firstColumn] = t;
        }
        return matrix;
    }

    //Sum of matrix's columns' elements
    public static Integer[] sumOfColumnElements (Matrix<Integer> inputMatrix) {
        Integer[] sumArray = new Integer[inputMatrix.getMatrix()[0].length];
        Integer[][] matrix = inputMatrix.getMatrix();
        int max = 0;
        Set<Integer> setOfMaxColumns = new HashSet<>();
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumArray[i] += matrix[j][i];
            }
            if (sumArray[i] > max) {
                max = sumArray[i];
                setOfMaxColumns.clear();
                setOfMaxColumns.add(i + 1);
            } else if (sumArray[i] == max) {
                setOfMaxColumns.add(i + 1);
            }
        }
        inputMatrix.setSet(setOfMaxColumns);
        return sumArray;
    }

    //Max of Integer array
    static int maxOfArray(Integer[] array) {
        Integer max = array[0];
        for (Integer i : array) {
            if (i > max) max = i;
        }
        return max;
    }



    //return the set of columns, in which the first element more than the last
//    public static Set<List<T>>



}
