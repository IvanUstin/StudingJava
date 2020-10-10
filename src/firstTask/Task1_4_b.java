package firstTask;

import java.util.Scanner;

public class Task1_4_b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number X kind of nnn.ddd: ");
        String str = s.next();

        String str1 = str.substring(4);
        String str2 = str.substring(0,3);
        str = String.join(".",str1,str2);

        Double d = Double.parseDouble(str);
        System.out.println(d);
    }
}
