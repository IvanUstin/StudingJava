package algoritmization.oneDimendtionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsFirstTask {

    //                               1

    //to create an int array with all requests to user
    static int[] createIntArray(int N, int x, int y) {
        System.out.println("Enter numbers separated by a space:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int[] array;
        if (input.equalsIgnoreCase("test")) {
            array = MethodsFirstTask.someArrayInt(N, x, y);
            for (int i = 0; i < N; i++) {
                System.out.print(i + "\t");
            }
            System.out.println();
            for (int d : array) {
                System.out.print(d + "\t");
            }
            System.out.println();
        } else array = MethodsFirstTask.stringToArrayOfInt(input);
        return array;
    }

    //to create an double array with all requests to user
    static double[] createDoubleArray(int N, double x, double y) {
        System.out.println("Enter numbers separated by a space:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double[] array;
        if (input.equalsIgnoreCase("test")) {
            array = MethodsFirstTask.someArrayRound(N, x, y);
            System.out.println(Arrays.toString(array));
        } else array = MethodsFirstTask.stringToArrayOfDouble(input);
        return array;
    }

    // перевести строку с целыми числами в массив этих чисел
    static int[] stringToArrayOfInt(String string) {
        String[] input = string.split("\\D+");
        int[] intInput = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            intInput[i] = Integer.parseInt(input[i]);
        }
        return intInput;
    }

    // сумма чисел из массива, кратных определенному делителю
    static int sumOfMultipleNumbers(int divider, int[] arrayOfNumbers) {
        int count = 0;
        for (int i : arrayOfNumbers) {
            if (i % divider == 0) count += i;
        }
        return count;
    }

    //                                2

    //перевести строку с дробными числами в массив этих чисел
    static double[] stringToArrayOfDouble(String string) {
        String[] input = string.split("\\s+");
        double[] doubleInput = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            doubleInput[i] = Double.parseDouble(input[i]);
        }
        return doubleInput;
    }

    //возвращает измененый массив: если элемент массива больше заданного
    // числа, меняет элемент на это число
    static double[] changeToZ(double Z, double[] array) {
        double[] nextArray = array.clone();
        for (int i = 0; i < nextArray.length; i++) {
            if (nextArray[i] > Z) nextArray[i] = Z;
        }
        return nextArray;
    }

    // возвращает число замен в массиве
    static int quantityOfChanges(double[] firstArray, double[] secondArray) {
        int i = 0;
        int quantityOfChanges = 0;
        for (double d :
                firstArray) {
            if (d != secondArray[i]) quantityOfChanges++;
            i++;
        }
        return quantityOfChanges;
    }

    //                               3

    // возвращает случайный массив
    // с количеством элементов N со значением в границах (x;y)
    static double[] someArray(int N, double x, double y) {
        double[] array = new double[N];
        for (int i = 0; i < N; i++) {
            array[i] = Math.random() * (y - x) + x;
        }
        return array;
    }

    // возвращает случайный целочисленный массив
    // с количеством элементов N со значением в границах (x;y)
    static int[] someArrayInt(int N, int x, int y) {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * (y - x) + x);
        }
        return array;
    }

    // возвращает случайный округленый массив
    // с количеством элементов N со значением (x;y)
    static double[] someArrayRound(int N, double x, double y) {
        double[] array = new double[N];
        for (int i = 0; i < N; i++) {
            array[i] = Math.round(Math.random() * (y - x) + x);
        }
        return array;
    }

    //Quantity of positive numbers of array
    static int quantityOfPositive(double[] array) {
        int quantity = 0;
        for (double i : array) {
            if (i > 0) quantity++;
        }
        return quantity;
    }

    //Quantity of negative numbers of array
    static int quantityOfNegative(double[] array) {
        int quantity = 0;
        for (double i : array) {
            if (i < 0) quantity++;
        }
        return quantity;
    }

    //zero quantity of array
    static int quantityOfZero(double[] array) {
        int quantity = 0;
        for (double i : array) {
            if (i == 0) quantity++;
        }
        return quantity;
    }

    //                                4

    //Max of double array
    static double maxOfArray(double[] array) {
        double max = array[0];
        for (double i : array) {
            if (i > max) max = i;
        }
        return max;
    }

    //Max of int array
    static int maxOfArray(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) max = i;
        }
        return max;
    }

    //Min of double array
    static double minOfArray(double[] array) {
        double min = array[0];
        for (double i : array) {
            if (i < min) min = i;
        }
        return min;
    }

    //Min of int array
    static int minOfArray(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) min = i;
        }
        return min;
    }

    //swap elements
    static void swap(double[] array, double min, double max) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[i] = min;
            } else if (array[i] == min) {
                array[i] = max;
            }
        }
    }

    //                                5

    //If array[i] > i then sout(array[i])
    static void outOfSequence(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) System.out.println(array[i]);
        }
    }

    //                                6

    //Check if number is simple
    static boolean isSimple(int i) {
        if (i > 1) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    //                                 7

    //new array of edge amounts
    static double[] edgeAmount(double[] array) {
        int length;
        length = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        double[] newArray = new double[length];
        for (int i = 0, j = 0, k = array.length - 1; i < length; i++, j++, k--) {
            if (j == k) {
                newArray[i] = array[j];
            } else {
                newArray[i] = array[j] + array[k];
            }
        }
        return newArray;
    }

    //                                 8

    //to delete elements of array with specific value and return new array
    static int[] deleteElements(int extra, int[] array) {
        int count = 0;
        int min = extra;
        for (int value : array) {
            if (value == min) count++;
        }
        int[] newArray = new int[array.length - count];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] == min) {
                continue;
            }
            newArray[j++] = array[i];
        }
        return newArray;
    }

    //                                  9

    //define the most common number of array
    static int commonNumber(int[] array2) {
        int[] array = array2.clone();
        int count = 1;
        int index = 0;
        int position = 0;
        while (array.length > 0) {
            int i = 0;
            int k = 0;
            int a = 0;
            for (int value : array) {
                if (value == array[i]) {
                    k++;
                } else if (a == 0) {
                    a++;
                    position += k;
                }
            }
            if (k == count) {
                index = array[i] < array2[index] ? position-1 : index;
            } else if (k > count) {
                count = k;
                index = position-1;
            }
            System.out.println(array[i] + " " + k);
            array = deleteElements(array[i], array);
        }
        return array2[index];
    }

    //faster


    //                                  10

    //delete every second element. assign the remaining elements to zero.
    static int[] compression(int[] array2) {
        int[] array = array2.clone();
        int k = 1;
        for (int i = 1; i < array.length - 1; i++) {
            if (i % 2 != 0) {
                array[k++] = array[i + 1];
            }
        }
        for (; k < array.length; k++) {
            array[k] = 0;
        }
        return array;
    }
}
