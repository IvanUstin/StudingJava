package programmingWithClasses.classesAndObjects.task5;

public class Counter {
    private int count;
    private int inc;
    private int dec;
    private int bottom;
    private int top;

    public Counter (int init, int increase, int decrease, int bottom, int top) {
        count = init;
        inc = increase;
        dec = decrease;
        this.bottom = bottom;
        this.top = top;
    }

    public Counter (int increase, int decrease, int bottom, int top) {
        this((int) (Math.random() * (top - bottom + 1) + bottom), increase, decrease, bottom, top);
    }

    public void increase() {
        if (count + inc < top) {
            count += inc;
        } else {
            count = top;
        }
        show();
    }

    public void decrease() {
        if (count - dec > bottom) {
            count -= dec;
        } else {
            count = bottom;
        }
        show();
    }

    public void show() {
        System.out.println(count);
    }

    public void setInc(int inc) {
        this.inc = inc;
    }

    public void setDec(int dec) {
        this.dec = dec;
    }

    public int getCount() {
        return count;
    }
}
