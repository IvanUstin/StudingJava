package basic.firstTask;

class Dot {
    final double x;
    final double y;

    Dot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //возращает точку со случайной координатой в диапазоне квадрата с центром
    //в пересечении осей координат со стороной i, указывает координаты.

    public static Dot test(double i) {
        double x = Math.random() * i - i / 2;
        double y = Math.random() * i - i / 2;
        Dot dot = new Dot(x,y);
        System.out.println("x = " + x + "; y = " + y + ";");
        return dot;
    }
}
