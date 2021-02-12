package basic.firstTask;

public class Dot {
    final private double x;
    final private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Dot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //возращает точку со случайной координатой в диапазоне квадрата с центром
    //в пересечении осей координат со стороной i, указывает координаты.

    public static Dot test(double i) {
        double x = Math.random() * i - i / 2;
        double y = Math.random() * i - i / 2;
        return new Dot(x,y);
    }

    @Override
    public String toString() {
        return "Dot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
