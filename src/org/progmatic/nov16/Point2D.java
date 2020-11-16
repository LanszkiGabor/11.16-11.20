package org.progmatic.nov16;

public class Point2D {
    protected int x;
    protected int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void twoTime() {
        x = x * 2;
        y = y * 2;
    }

    public void get() {
        System.out.println(x + " : " + y);
    }
}
