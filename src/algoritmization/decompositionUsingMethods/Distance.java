package algoritmization.decompositionUsingMethods;

import basic.firstTask.Dot;

public class Distance {

    private Dot firstDot;
    private Dot secondDot;
    private double distance;

    public Distance() {

    }

    public Distance(Dot firstDot, Dot secondDot, double distance) {
        this.firstDot = firstDot;
        this.secondDot = secondDot;
        this.distance = distance;
    }

    public Dot getFirstDot() {
        return firstDot;
    }

    public void setFirstDot(Dot firstDot) {
        this.firstDot = firstDot;
    }

    public Dot getSecondDot() {
        return secondDot;
    }

    public void setSecondDot(Dot secondDot) {
        this.secondDot = secondDot;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
