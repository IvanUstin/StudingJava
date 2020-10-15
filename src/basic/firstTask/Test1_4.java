package basic.firstTask;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test1_4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        BigDecimal f, e = null;

        System.out.println("Enter number X kind of nnn.ddd: ");
        f = s.nextBigDecimal();

        int c = f.intValue();
        double a = f.doubleValue();

        e = e.valueOf(a);
        e = e.subtract(BigDecimal.valueOf(c));
        e = e.multiply(BigDecimal.valueOf(1000));

        f = f.valueOf(c);
        f = f.divide(BigDecimal.valueOf(1000));

        f = f.add(e);

        System.out.println(f);
    }
}
