package programmingWithClasses.classesAndObjects.task7;

import basic.firstTask.Dot;

/**
 * This class implements triangular as coordinates of three dots
 */
public class Triangle {

    final private Dot A;
    final private Dot B;
    final private Dot C;

    /**
     * Usual constructor
     * @param Ax coordinate x of the dot A
     * @param Ay coordinate y of the dot A
     * @param Bx coordinate x of the dot B
     * @param By coordinate y of the dot B
     * @param Cx coordinate x of the dot C
     * @param Cy coordinate y of the dot C
     */
    public Triangle (double Ax, double Ay, double Bx, double By, double Cx, double Cy) {
        A = new Dot(Ax, Ay);
        B = new Dot(Bx, By);
        C = new Dot(Cx, Cy);
    }

    public Dot getA() {
        return A;
    }

    public Dot getB() {
        return B;
    }

    public Dot getC() {
        return C;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                '}';
    }
}
