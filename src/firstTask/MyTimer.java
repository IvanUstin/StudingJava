package firstTask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyTimer {

    public void timer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This timer can count to 23:59:59." +
                "\nEnter 1 to start timer");
        int i = scanner.nextInt();

        while (i != 1) {
            System.out.println("1 to start");
            i = scanner.nextInt();
        }

        Date date1 = new Date();

        System.out.println("Enter 2 to stop timer");
        int y = scanner.nextInt();

        while (y != 2) {
            System.out.println("2 to stop");
            y = scanner.nextInt();
        }
        Date date2 = new Date();

        long a = date2.getTime() - date1.getTime() - 3*3600*1000;

        SimpleDateFormat s = new SimpleDateFormat("HHч mmмин ssс");

        System.out.println("Result: " + s.format(a));
    }

    public void secondsToFormat() {
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat s = new SimpleDateFormat("HHч mmмин ssс");

        System.out.println("Enter passed time in seconds: ");
        long l = scanner.nextLong();

        System.out.println(s.format(l*1000-3*3600*1000));
    }

    public void secondsToFormat(long l) {
        SimpleDateFormat s = new SimpleDateFormat("HHч mmмин ssс");

        System.out.println(s.format(l*1000-3*3600*1000));
    }
}
