package org.progmatic.nov17;

public class Hexagon implements Shape{

    private final double a;

    public Hexagon(double a) {
        this.a = a;
    }

    @Override
    public double getCircumstance() {
        return 6 * a;
    }

    @Override
    public double getArea() {
        return 3 * Math.sqrt(3) / 2 * (a * a);
    }

}
