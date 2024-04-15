package org.example.figures;

public class Ttriangle {
    public double area(double a, double h) {

        return a * h /2;
    }

    public double area(double a, double b, int alpha) {

        return a * b * Math.sin(alpha)/2;
    }

    public double perimeter(double a, double b, double c) {

        return a + b + c;
    }
}
