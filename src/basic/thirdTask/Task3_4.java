package basic.thirdTask;

import java.math.BigInteger;

/*Составить программу нахождения произведения квадратов первых двухсот чисел.

 */
public class Task3_4 {
    public static void main(String[] args) {

        BigInteger sum = BigInteger.valueOf(1);

        for (int i = 1; i <= 200; i++)  {
            sum = sum.multiply(BigInteger.valueOf((long)Math.pow(i,2)));
            System.out.println(sum);
        }

        System.out.println(sum);
    }
}
