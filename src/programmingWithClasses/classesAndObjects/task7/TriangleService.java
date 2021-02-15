package programmingWithClasses.classesAndObjects.task7;

import basic.firstTask.Dot;

/**
 * This class implements methods that can count perimeter,
 * area and coordinates of crossing of triangle's medians.
 *
 * @author IvanUstin
 * @version 1.0
 */
public class TriangleService {

    /**
     * this method count an area of triangle
     *
     * @param tri specific triangle
     */
    public static double area(Triangle tri) {
        double a11 = tri.getA().getX() - tri.getC().getX();
        double a12 = tri.getA().getY() - tri.getC().getY();
        double a21 = tri.getB().getX() - tri.getC().getX();
        double a22 = tri.getB().getY() - tri.getC().getY();
        double det = a11 * a22 - a12 * a21;
        return Math.abs(det) / 2;
    }

    /**
     * this method count the perimeter of given triangle
     *
     * @param tri given triangle
     */
    public static double perimeter(Triangle tri) {
        double a = side(tri.getA(),tri.getB());
        double b = side(tri.getA(),tri.getC());
        double c = side(tri.getC(),tri.getB());
        return a + b + c;
    }

    /**
     * this method defines coordinates of crossing of triangle medians
     *
     * @param tri certain triangle
     */
    public static Dot crossingMedians(Triangle tri) {
        return new Dot((tri.getA().getX() + tri.getB().getX() + tri.getC().getX()) / 3, (tri.getA().getY() + tri.getB().getY() + tri.getC().getY()) / 3);
    }

    public static double side(Dot a, Dot b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}
