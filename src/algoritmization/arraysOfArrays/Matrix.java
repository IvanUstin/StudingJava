package algoritmization.arraysOfArrays;

import java.util.*;

public class Matrix <T extends Number> {
    private T[][] matrix;
    private int count;
    private int column;
    private Set<Integer> set;
    private List<List> tMatrix;
    private static int superCount;
    private T max;

    Matrix (int rows, int column, int min, int maxi) {
        Integer[][] matrix = new Integer[rows][column];
        setMax((T)(Integer)min);
        for (Integer[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                row[i] = (int) (Math.random() * (maxi - min + 1) + min);
                if (row[i] > getMax().intValue()) {
                    setMax((T)row[i]);
                }
            }
        }
        setMatrix((T[][])matrix);
    }

    public T getMax() {
        return max;
    }

    public void setMax(T max) {
        this.max = max;
    }

    public static int getSuperCount() {
        return superCount;
    }

    public static void setSuperCount(int superCount) {
        Matrix.superCount = superCount;
    }


    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<List> gettMatrix() {
        return tMatrix;
    }

    public void settMatrix(List<List> tMatrix) {
        this.tMatrix = tMatrix;
    }

    public Matrix() {
    }

    public T[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(T[][] matrix) {
        this.matrix = matrix;
    }


    //represent the matrix into console
    public String toString() {
        if (matrix != null) {
            StringBuilder matrixString = new StringBuilder("");
            for (T[] ts : matrix) {
                matrixString.append("|");
                for (int j = 0; j < matrix[0].length; j++) {
                    matrixString.append(matrix instanceof Double[][] ? String.format("%10s",ts[j]) :"\t" + ts[j]);
                }
                matrixString.append("\t|\n");
            }
            return matrixString.toString();
        } else {
            for (List a : tMatrix) {
                System.out.println(a);
            }
            return "";
        }
    }

    //represent the row of the matrix
    public T[] getRowOfMatrix(int row) {
        return matrix[row];
    }

    //represent the column of the matrix
    public List<T> getColumnOfMatrix(int column) {
        List<T> columnArray = new ArrayList<>();
        for (T[] ts : matrix) {
            columnArray.add(ts[column]);
        }
        return columnArray;
    }

    public Integer[] getColumnOfMatrixArray (int row) {
        Integer[] column = new Integer[matrix.length];
        int count = 0;
        for (T[] rows : matrix) {
            column[count] = rows[row].intValue();
            count++;
        }
        return column;
    }



    //return the set of odd columns, in which the first element more than the last
    public Map<String, List<T>> oddColumns() {
        Map<String, List<T>> columns = new HashMap<>();
        for (int i = 0; i < matrix.length; i += 2) {
            if (matrix[0][i].intValue() > matrix[matrix.length - 1][i].intValue()) {
                columns.put((i + 1) + " column ", getColumnOfMatrix(i));
            }
        }
        return columns;
    }

    //return the specific diagonal of elements
    public List<T> diagonalElements(boolean isUpDown)  throws NotSquareMatrixException{

        if (matrix.length != matrix[0].length) {
            throw new NotSquareMatrixException("current matrix isn't square");
        }
        List<T> Elements = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            Elements.add(isUpDown ? matrix[i][i] : matrix[matrix.length - 1 - i][i]);
        }
        return Elements;
    }

}
