package algoritmization.arraysOfArrays;

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

    //create an square Integer matrix
    public static Integer[][] newSquareIntegerMatrix(int side) {

        List<Integer> digit = new ArrayList<>();
        for (int i = 0; i < (side*side); i++) {
            digit.add(i+1);
        }
        Integer[][] matrix = new Integer[side][side];
        for (Integer[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                row[i] = digit.remove((int) (Math.random()*digit.size()));
            }
        }
        return matrix;
    }

    //sum of all previous numbers
    public static int sumWithPrevious (int number) {
        if (number == 1) {
            return 1;
        }
        return number + sumWithPrevious(number-1);
    }

    //check the magic matrix
    public static long checkMagicSquare (Matrix<Integer> matrix, int side) {
        int condition = sumWithPrevious(side*side) / side;
        int check = 0;
        long tries = 0L;
        while (check < 1) {
            tries++;
            System.out.println(tries);
            matrix.setMatrix(newSquareIntegerMatrix(side));
            Integer[] sum = sumOfRowsElements(matrix);
            boolean checkElement = false;
            for (Integer element : sum) {
                if (element != condition) {
                    checkElement = true;
                    break;
                }
            }
            if (checkElement) continue;
            sum = sumOfColumnsElements(matrix);
            for (Integer element : sum) {
                if (element != condition) {
                    checkElement = true;
                    break;
                }
            }
            if (checkElement) continue;
            if (sumOfDiagonal(matrix,true) != condition) continue;
            if (sumOfDiagonal(matrix,false) != condition) continue;
            check++;
        }
        return tries;
    }

    //create an Integer matrix in accordance with the condition of the fours task
    public static Integer[][] newReverseMatrix(int N) throws N_MustBeEvenException {
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
    public static Integer[][] newTriangleMatrix(int N) throws N_MustBeEvenException {
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
    public static Integer[][] newSandClockMatrix(int N) throws N_MustBeEvenException {
        if (N % 2 != 0) {
            throw new N_MustBeEvenException("N must be even");
        }
        Integer[][] matrix = new Integer[N][N];
        for (int i = 0; i < N; i++) {
            if (i < N / 2) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = ((j >= i) && (j < N - i)) ? 1 : 0;
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
                bd = bd.valueOf(Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / N));
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
    public static List<List> newListMatrix(int N, int min, int max, boolean isInt) {
        List<List> matrix = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            List nextRow = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                nextRow.add(isInt ? (Integer.valueOf ((int) (Math.random() * (max - min + 1) + min))): ((Double.valueOf (Math.random() * (max - min + 1) + min))));
                System.out.println(nextRow);
            }
            matrix.add(nextRow);
        }
        return matrix;
    }

    //swap columns of matrix
    public static <T extends Number> T[][] swap(T[][] inputMatrix, int firstColumn, int secondColumn) {
        T[][] matrix = inputMatrix.clone();
        for (int i = 0; i < matrix.length; i++) {
            T t = matrix[i][secondColumn];
            matrix[i][secondColumn] = matrix[i][firstColumn];
            matrix[i][firstColumn] = t;
        }
        return matrix;
    }

    //Sum of matrix's columns' elements
    public static Integer[] sumOfColumnElementsWithMax(Matrix<Integer> inputMatrix) {
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

    //Sum of matrix's rows' elements
    public static Integer[] sumOfRowsElements(Matrix<Integer> inputMatrix) {
        Integer[][] matrix = inputMatrix.getMatrix();
        Integer[] sumArray = new Integer[matrix.length];
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumArray[i] += matrix[i][j];
            }
        }
        return sumArray;
    }

    //Sum of matrix's columns' elements
    public static Integer[] sumOfColumnsElements(Matrix<Integer> inputMatrix) {
        Integer[][] matrix = inputMatrix.getMatrix();
        Integer[] sumArray = new Integer[matrix.length];
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumArray[i] += matrix[j][i];
            }
        }
        return sumArray;
    }

    //sum of diagonal elements
    public static Integer sumOfDiagonal (Matrix<Integer> matrix, boolean isUpDown) {
        Integer[][] newMatrix = matrix.getMatrix();
        Integer sum = 0;
        for (int i = 0; i < newMatrix.length; i++) {
            sum += (isUpDown ? newMatrix[i][i] : newMatrix[newMatrix.length - 1 - i][i]);
        }
        return sum;
    }

    //Max of Integer array
    static int maxOfArray(Integer[] array) {
        Integer max = array[0];
        for (Integer i : array) {
            if (i > max) max = i;
        }
        return max;
    }

    //find rows in which specified number repeats at least certain times
    public static <T extends Number> Set<Integer> specialRows(Matrix<T> matrix, T value, int repeatTimes) {
        Set<Integer> setRows = new HashSet<>();
        int rowIndex = 0;
        for (T[] rows : matrix.getMatrix()) {
            int times = 0;
            for (T element : rows) {
                if (element.equals(value)) {
                    times++;
                }
                if (times == repeatTimes) {
                    setRows.add(rowIndex);
                    break;
                }
            }
            rowIndex++;
        }
        return setRows;
    }

    //sorts rows of matrix
    public static <T extends Number> T[][] sortMatrixRows(Matrix<T> notSortedMatrix, boolean isAscending) {
        T[][] newMatrix = notSortedMatrix.getMatrix().clone();
        for (T[] matrix : newMatrix) {
            quickSort(matrix, 0, matrix.length - 1, isAscending);
        }
        return newMatrix;
    }

    public static <T extends Integer> void sortMatrixColumns(Matrix<Integer> matrix, boolean isAscending) {
        Integer[][] currentMatrix = matrix.getMatrix();
        for (int i = 0; i < currentMatrix.length; i++) {
            Integer[] column = matrix.getColumnOfMatrixArray(i);
            quickSort(column, 0, column.length - 1, isAscending);
            for (int j = 0; j < column.length; j++) {
                currentMatrix[j][i] = column[j];
            }
        }
        matrix.setMatrix(currentMatrix);
    }

    public static <T extends Number> void quickSort(T[] array, int fst, int lst, boolean isAscending) {
        Matrix.setSuperCount(Matrix.getSuperCount()+1);
        if (fst >= lst) {
            return;
        }
        int i = fst;
        int j = lst;
        int mdl = array[(fst + lst) / 2].intValue();

        while (i < j) {
            while (isAscending ? array[i].intValue() < mdl : array[i].intValue() > mdl) {
                i++;
            }
            while (isAscending ? array[j].intValue() > mdl : array[j].intValue() < mdl) {
                j--;
            }
            if (i <= j) {
                T tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        quickSort(array, fst, j, isAscending);
        quickSort(array, i, lst, isAscending);
    }


    public static Integer[][] newBinaryMatrix(int rows, int columns) {
        Integer[][] matrix = new Integer[rows][columns];
        for (int i = 0; i < columns; i++) {
            Integer[] array = new Integer[rows];
            binaryRandom(0, array.length - 1, i + 1,array);
//            System.out.println(Arrays.toString(array));
            for (int j = 0; j < rows; j++) {
                matrix[j][i] = array[j];
            }
        }
        return matrix;
    }

    public static void binaryRandom(int fst, int lst, int times, Integer[] array) {
        if (fst == 0 && lst == array.length - 1) {
            Matrix.setSuperCount(times);
        }
        if (fst > lst) {
            return;
        }
        int x = (int) ((Math.random() * (lst - fst + 1)) + fst);
        if (Matrix.getSuperCount() == 0) {
            array[x] = 0;
        } else {
            array[x] = 1;
            Matrix.setSuperCount(Matrix.getSuperCount() - 1);
        }
        if (fst == lst) {
            return;
        }
//        System.out.printf("%s %d\n",Arrays.toString(array),Matrix.getSuperCount());
        if (0 == (int) (Math.random() * 2)) {
            binaryRandom(fst, --x, times, array);
            x += 2;
            binaryRandom(x, lst, times, array);
        } else {
            binaryRandom(++x, lst, times, array);
            x -= 2;
            binaryRandom(fst, x, times, array);
        }
    }

    //changes uneven elements of matrix to substitute
    public static Integer[][] changeUnevenElements (Integer[][] oldMatrix, int substitute) {
        Integer[][] matrix = oldMatrix.clone();
        for (Integer[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                if (row[i] % 2 != 0) {
                    row[i] = substitute;
                }
            }
        }
        return matrix;
    }


}
