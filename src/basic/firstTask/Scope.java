package basic.firstTask;

import java.util.Scanner;

public class Scope {

    // Ввод координат точки с консоли с проверкой попадания в область определения
    public void scope() {
        System.out.println("Enter X:");
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();

        System.out.println("Enter Y:");
        double y = s.nextDouble();

        if (y < -3 || y > 4) System.out.println("false");
        else if (x >= -2 && x <= 2) System.out.println("true");
        else if (y > 0) System.out.println("false");
        else if (x >= -4 && x <= 4) System.out.println("true");
        else System.out.println("false");
    }

    //метод для определения попадания в область определения с параметрами x,y
    public boolean scope(double x, double y) {
        if (y < -3 || y > 4) return false;
        else if (x >= -2 && x <= 2) return true;
        else if (y > 0) return false;
        else if (x >= -4 && x <= 4) return true;
        else return false;
    }

    //Быстрая проверка со случайными точками
    public void scope(Dot dot) {

        double x = dot.getX();
        double y = dot.getY();

        if (y < -3 || y > 4) System.out.println("false");
        else if (x >= -2 && x <= 2) System.out.println("true");
        else if (y > 0) System.out.println("false");
        else if (x >= -4 && x <= 4) System.out.println("true");
        else System.out.println("false");
    }
}
