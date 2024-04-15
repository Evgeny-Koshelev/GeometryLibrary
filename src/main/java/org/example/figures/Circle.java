package org.example.figures;

public class Circle {

    public double area(double r) {

        return Math.PI * Math.pow(r, 2);
    }

    public double perimeter(double r) {

        return 2 * Math.PI * r;
    }
}
