package org.progmatic.nov17.sikbeli;

public class Square implements Shape{

    private final double a;

    public Square(double side) {
        this.a = side;
    }

    @Override
    public double getCircumstance() {
        return 4 * a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public String toString() {
        return "Square";
    }
}
