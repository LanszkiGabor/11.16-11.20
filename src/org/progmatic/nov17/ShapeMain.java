package org.progmatic.nov17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) throws FileNotFoundException {
        fullPrintInfo(reader());
        System.out.println(getLargestShape(reader()).toString());
    }

    public static void printInfo(Shape s) {
        System.out.println("Kerület: " + s.getCircumstance());
        System.out.println("Terület: " + s.getArea());
        System.out.println("Kettő aránya: " + s.getArea() / s.getCircumstance());
        if (s.getArea() == s.getCircumstance()) {
            System.out.println("Perfekt");
        } else if (s.getArea() < s.getCircumstance()) {
            System.out.println("Sovány");
        } else {
            System.out.println("Kövér");
        }
        System.out.println("---------");
    }

    public static List<Shape> reader() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("files/shapes.csv"));
        List<Shape> read = new ArrayList<>();
        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().split(",");
            int shape = Integer.parseInt(line[0]);
            int side = Integer.parseInt(line[1]);
            if (shape == 0) {
                read.add(new Circle(side));
            } else if (shape == 3) {
                read.add(new Triangle(side));
            } else if (shape == 4) {
                read.add(new Square(side));
            } else {
                read.add(new Hexagon(side));
            }
        }
        return read;
    }

    public static void fullPrintInfo(List<Shape> shapes) {
        for (Shape shape : shapes) {
            printInfo(shape);
        }
    }

    public static Shape getLargestShape(List<Shape> shapes) {
        Shape maxArea = shapes.get(0);
        for (Shape shape : shapes) {
            if (shape.getArea() > maxArea.getArea()) {
                maxArea = shape;
            }
        }
        return maxArea;
    }
}
