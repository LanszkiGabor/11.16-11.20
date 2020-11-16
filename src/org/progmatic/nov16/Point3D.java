package org.progmatic.nov16;

public class Point3D extends Point2D {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void twoTime() {
        x = x * 2;
        y = y * 2;
        z = z * 2;
    }

    @Override
    public void get() {
        System.out.println(x + " : " + y + " : " + z );
    }
}
