package programmingWithClasses.classesAndObjects;

public class Test1 {
    private static int x;
    private static int y;

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        Test1.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        Test1.y = y;
    }

    public static void showX() {
        System.out.println(x);
    }

    public static void showY() {
        System.out.println(y);
    }

    public static int sum() {
        return x + y;
    }

    public static int max() {
        return Math.max(x,y);
    }
}
