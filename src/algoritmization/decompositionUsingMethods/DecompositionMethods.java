package algoritmization.decompositionUsingMethods;

import algoritmization.arraysOfArrays.Matrix;
import algoritmization.oneDimendtionalArrays.MethodsFirstTask;
import basic.firstTask.Dot;

import java.util.ArrayList;
import java.util.List;

//Methods of "Decomposition Using Methods" Task
public class DecompositionMethods {

    // returns the min common multiple if argument "isMax" is true
    // or the max common divisor of given numbers if argument "isMax"
    // is false
    public static int commonMultipleOrDivider(int fst, int snd, boolean isMultiple) {
        if (fst > snd) {
            int tmp = fst;
            fst = snd;
            snd = tmp;
        }
        int commonFactor;
        int counter = 0;
        if (isMultiple) {
            commonFactor = snd;
            do {
                commonFactor *= ++counter;
            }
            while (commonFactor % fst != 0);
        } else {
            commonFactor = fst;
            while (!(fst % commonFactor == 0 && snd % commonFactor == 0)) {
                commonFactor = fst / 2 - counter++;
            }
        }
        return commonFactor;
    }

    // return the greatest common divisor of four numbers
    public static int divisorOfNumbers(Integer... number) {
        int divisor = MethodsFirstTask.minOfArray(number);
        int counter = 0;
        int steps = 0;
        while (steps < number.length) {
            steps = 0;
            for (Integer element : number) {
                if (element % divisor != 0) {
                    divisor = number[0] / 2 - counter++;
                    break;
                }
                steps++;
            }
        }
        return divisor;
    }

    //return the area of current SixAngle with side a
    public static double correctSixAngleArea(double a, int numberOfEdges) {
        return (numberOfEdges / 2 * a * a * Math.sin(Math.toRadians(360 / numberOfEdges)));
    }

    //generate certain number of dots with random coordinates in range of "Scope"
    public static List<Dot> listOfDots(int numberOfDots, int Scope) {
        List<Dot> listOfDots = new ArrayList<>();
        for (int i = 0; i < numberOfDots; i++) {
            listOfDots.add(Dot.test(Scope));
        }
        return listOfDots;
    }

    //find dots with the longest distance between
    public static void fareAwayDots(List<Dot> listOfDots) {
        double distance = 0;
        int firstDotIndex = 0;
        int secondDotIndex = 0;
        for (int i = 0; i < listOfDots.size() - 1; i++) {
            for (int j = i + 1; j < listOfDots.size(); j++) {
                double x = listOfDots.get(i).getX() - listOfDots.get(j).getX();
                double y = listOfDots.get(i).getY() - listOfDots.get(j).getY();
                double nextDistance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
                if (distance < nextDistance) {
                    distance = nextDistance;
                    firstDotIndex = i;
                    secondDotIndex = j;
                }
//                System.out.println(i + " " + j + " " + nextDistance);
            }
        }
        System.out.printf("The longest distance is %f\nbetween dot %d ,\nx = %f\ny = %f\nand dot %d\nx = %f\ny = %f",
                distance, firstDotIndex, listOfDots.get(firstDotIndex).getX(), listOfDots.get(firstDotIndex).getY(),
                secondDotIndex, listOfDots.get(secondDotIndex).getX(), listOfDots.get(secondDotIndex).getY());
    }

    //return the penultimate element of array
    public static <T extends Number> T penultimateMaxElement (T[] newArray) {
        T max = newArray[0];
        T preMax = newArray[0];
        for (T element : newArray) {
            if (element.doubleValue() > max.doubleValue()) {
                preMax = max;
                max = element;
            }
        }
        T lastCheck = newArray[newArray.length-1];
        if (lastCheck.doubleValue() < max.doubleValue() && lastCheck.doubleValue() > preMax.doubleValue()) {
            return lastCheck;
        }
        return preMax;
    }

    //defined if entered numbers are mutually prime
    public static boolean mutuallyPrime (Integer ... numbers) {
        return DecompositionMethods.divisorOfNumbers(numbers) == 1;
    }

    //factorial
    public static int factorial (int i) {
        if (i == 1) {
            return 1;
        }
        return factorial(i - 1) * i;
    }

    //sum of defined factorials
    public static long sumOfFactorials (int ... factorials) {
        long sum = 0L;
        for (int i : factorials) {
            sum += factorial(i);
        }
        return sum;
    }

    //sum of specified array elements
    public static <T extends Number> T sumOfSuccessiveElements (T[] array,int fstIndex, int lstIndex) {
        T sum = (T) Integer.valueOf(0);
        for (int i = fstIndex; i < lstIndex; i++) {
            sum = array[0] instanceof Integer ? (T) Integer.valueOf(sum.intValue() + array[i].intValue()) :
                    (T) Double.valueOf(sum.doubleValue() + array[i].doubleValue());
        }
        return sum;
    }

    //area of quadrangle
    public static double quadrangleAreaBySides(double a, double b, double c, double d) {
        double max = Math.max(Math.max(a,b),Math.max(c,d));
        double perimeter = a + b + c + d;
        double p = perimeter/2;
        if ( max > perimeter - max) {        // check if arguments are wrong
            return -1.;
        } else {
            return Math.sqrt((p - a) * (p - b) * (p - c) * (p - d));
        }
    }

    //return array with digits of current number
    public static int[] digitsOfNumber (int number) {
        String stringNumber = "" + number;
        int[] array = new int[stringNumber.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt("" + stringNumber.charAt(i));
        }
        return array;
    }

    //which number is longer
    public static <T extends Number,V extends Number,E extends Number> E longestNumber (T a, V b) {
        String fst = a instanceof Integer ? "" + a.intValue() : "" + a.doubleValue();
        String snd = b instanceof Integer ? "" + b.intValue() : "" + b.doubleValue();
        int one = a instanceof Integer ? fst.length() : fst.length()-1;
        int two = b instanceof Integer ? snd.length() : snd.length()-1;
        if (one >= two) {
            return (E)a;
        } else {
            return (E)b;
        }
    }

    public static double[] sumOfDigitsArray(int K, int N, int arrayLength) {
        double[] array = new double[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            StringBuilder number = new StringBuilder("");
            int sumOfDigits = K;
            do {
                int nextDigit = (int) (Math.random() * 10);
                number.append(nextDigit);
                sumOfDigits -= nextDigit;
            }
            while (sumOfDigits > 9);
            number.append(sumOfDigits);
            double Digits = Double.parseDouble(number.toString());
            int movePoint = 0;
            while (Digits > N) {
                Digits /= 10;
                movePoint++;
            }
            number.insert(number.length()-movePoint,'.');
            array[i] = Double.parseDouble(number.toString());
        }
        return array;
    }

    //shows numbers with defined difference in the specified range
    public static void twins (int n, int difference) {
        for (int i = n; i <= n*2 - difference; i++) {
            System.out.printf("%d and %d\n",i,i+difference);
        }
    }

    //row of armstrong numbers
    public static List<Integer> armstrongNumbers (int toNumber) {
        List<Integer> armstrongNumbers = new ArrayList<>();
        for (int i = 1; i <= toNumber; i++) {
            if (correctConditionOfArmstrongNumber(i) == i) {
                armstrongNumbers.add(i);
            }
        }
        return armstrongNumbers;
    }

    public static int conditionOfArmstrongNumber(int number) {
        String num = "" + number;
        int sumOfDigits = 0;
        for (int i = 0; i < num.length(); i++) {
            sumOfDigits += Integer.parseInt("" + num.charAt(i));
        }
        return  (int) Math.pow(sumOfDigits,num.length());
    }

    public static int correctConditionOfArmstrongNumber(int number) {
        String num = "" + number;
        int sumOfDigits = 0;
        for (int i = 0; i < num.length(); i++) {
            sumOfDigits += Math.pow(Integer.parseInt("" + num.charAt(i)),num.length());
        }
        return  sumOfDigits;
    }
}
