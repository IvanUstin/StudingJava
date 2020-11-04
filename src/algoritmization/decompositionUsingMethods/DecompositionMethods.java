package algoritmization.decompositionUsingMethods;

import algoritmization.oneDimendtionalArrays.MethodsFirstTask;
import basic.firstTask.Dot;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
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

    public static int NOD (int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public static int NOK (int a, int b) {
        return a * b / NOD(a,b);
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
        return ((a / 2) * a * Math.tan(Math.toRadians((180 - (360/numberOfEdges))/2)) * numberOfEdges / 2);
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
    public static Distance fareAwayDots(List<Dot> listOfDots) {
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
            }
        }
        return new Distance(listOfDots.get(firstDotIndex),listOfDots.get(secondDotIndex),distance);
//        System.out.printf("The longest distance is %f\nbetween dot %d ,\nx = %f\ny = %f\nand dot %d\nx = %f\ny = %f",
//                distance, firstDotIndex, listOfDots.get(firstDotIndex).getX(), listOfDots.get(firstDotIndex).getY(),
//                secondDotIndex, listOfDots.get(secondDotIndex).getX(), listOfDots.get(secondDotIndex).getY());
    }

    //return the penultimate element of array
    public static <T extends Number> T penultimateMaxElement (T[] newArray) {
        T max = newArray[0];
        T preMax = newArray[0];
        for (T element : newArray) {
            if (element.doubleValue() > max.doubleValue()) {
                preMax = max;
                max = element;
            } else if (element.doubleValue() > preMax.doubleValue()) {
                preMax = element;
            }
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
    public static double quadrangleAreaBySides(double X, double Y, double c, double d) {
        double straightTriangleArea = X * Y / 2;
        double hypotenuse = Math.sqrt(Math.pow(X,2) + Math.pow(Y,2));
        double p = (c + d + hypotenuse) / 2;                                   // half of perimeter
        double anotherTriangleArea = Math.sqrt(p * (p - hypotenuse) * (p - c) * (p - d));
        return straightTriangleArea + anotherTriangleArea;
    }

    //return array with digits of current number
    public static int[] digitsOfNumber (int number) {
        String stringNumber = Integer.toString(number);
        int[] array = new int[stringNumber.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
        }
        return array;
    }

    //which number is longer
    public static <T extends Number> T longestNumber (T a, T b) {
        String fst = String.valueOf(a).replace(".","");
        String snd = String.valueOf(b).replace(".","");
        return (fst.length() >= snd.length()) ? a : b;
    }

    public static double[] sumOfDigitsArray(int K, int limit, int arrayLength) {
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
            while (Digits > limit) {
                Digits /= 10;
                movePoint++;
            }
            number.insert(number.length()-movePoint,'.');
            array[i] = Double.parseDouble(number.toString());
        }
        return array;
    }

    //shows numbers with defined difference in the specified range
    public static void primeTwins(int n) {
        int previousPrime = 0;
        for (int i = n; i <= n * 2; i++) {
            if (isPrime(i) && i - previousPrime == 2) {
                System.out.printf("%d and %d are twins-prime\n",previousPrime,i);
                previousPrime = i;
            } else if (isPrime(i)) {
                previousPrime = i;
            }
        }
    }

    public static boolean isPrime (int number) {
        if (number < 2) return false;
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    //row of armstrong numbers
    public static List<Integer> armstrongNumbers (int toNumber) {
        List<Integer> armstrongNumbers = new ArrayList<>();
        for (int i = 1; i <= toNumber; i++) {
            if (isArmstrongNumber(i)) {
                armstrongNumbers.add(i);
            }
        }
        return armstrongNumbers;
    }

    public static int conditionOfArmstrongNumber(int number) {
        String num = String.valueOf(number);
        int sumOfDigits = 0;
        for (int i = 0; i < num.length(); i++) {
            sumOfDigits += Integer.parseInt("" + num.charAt(i));
        }
        return  (int) Math.pow(sumOfDigits,num.length());
    }

    public static int correctConditionOfArmstrongNumber(int number) {
        String num = String.valueOf(number);
        int sumOfDigits = 0;
        for (int i = 0; i < num.length(); i++) {
            sumOfDigits += Math.pow(Integer.parseInt("" + num.charAt(i)),num.length());
        }
        return  sumOfDigits;
    }

    public static boolean isArmstrongNumber (int number) {
        return correctConditionOfArmstrongNumber(number) == number;
    }

    public static List<Integer> ascendingDigits(int numberOfDigits) {
        List<Integer> ascendingDigits = new ArrayList<>();
        if (numberOfDigits < 2 || numberOfDigits > 9) {
            ascendingDigits.add(-1);
            return ascendingDigits;
        }
        Integer[] number = number(numberOfDigits);
        for (int i = numberOfDigits - 2; i >= 0; i--) {
            while (number[numberOfDigits - 1] <= 9) {
                ascendingDigits.add(fullNumber(number));
                number[numberOfDigits - 1]++;
            }
            if (number[i] < 10 - numberOfDigits + i) {
                number[i]++;
                for (int j = i + 1; j < numberOfDigits; j++) {
                    number[j] = number[j-1] + 1;
                }
                i = numberOfDigits - 1;
            }
        }
        return ascendingDigits;
    }

    public static Integer[] number(int numberOFDigits) {
        Integer[] number = new Integer[numberOFDigits];
        for (int i = 0; i < numberOFDigits; i++) {
            number[i] = i + 1;
        }
        return number;
    }

    public static Integer fullNumber(Integer[] array) {
        int fullNumber = 0;
        for (int i = array.length; i > 0; i--) {
            fullNumber += array[i - 1] * (int) Math.pow(10, array.length - i);
        }
        return fullNumber;
    }

    public static BigDecimal sumOfNumbersWithUnevenDigits (int numberOfDigits) {
        //initialise first number
        Integer[] firstNumber = new Integer[numberOfDigits];
        Arrays.fill(firstNumber, 1);
        int number = fullNumber(firstNumber);

        //define the sum
        BigDecimal sum = new BigDecimal(0);
        do {
            sum = sum.add(BigDecimal.valueOf(number));
            number += 2;
        } while (number < (int) Math.pow(10,numberOfDigits));
        return sum;
    }

    //quantity of even digits of the number
    public static int quantityOfEvenDigits (BigDecimal number) {
        String num = number.toString();
        int quantity = 0;
        for (int i = 0; i < num.length(); i++) {
            if (Integer.parseInt("" + num.charAt(i)) % 2 == 0) {
                quantity++;
            }
        }
        return quantity;
    }

    public static Integer sumOfDigits (Integer number) {
        number = Math.abs(number);
        String num = Integer.toString(number);
        int sumOfDigits = 0;
        for (char ch :
                num.toCharArray()) {
            sumOfDigits += Integer.parseInt("" + ch);
        }
        return sumOfDigits;
    }

    public static Integer quantityOfIterations (Integer number) {
        int quantity = 0;
        while (number > 0) {
            number -= sumOfDigits(number);
            quantity++;
        }
        return quantity;
    }

    public static void twins (int firstNumber, int distance) {
        int previousPrime = 0;
        for (int i = firstNumber; i <= firstNumber*2; i++) {
            boolean isPrime = isPrime(i);
            if (isPrime && i - previousPrime == distance) {
                System.out.printf("%s and %s are twins-prime\n",previousPrime,i);
                previousPrime = i;
            } else if (isPrime) {
                previousPrime = i;
            }
        }
    }
}
