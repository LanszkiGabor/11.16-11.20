package org.progmatic.nov17.sikbeli;

public class Circle implements Shape{

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getCircumstance() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
