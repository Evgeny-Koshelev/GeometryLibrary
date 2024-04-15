package org.example;

public class Сomparison {

    public int comparisonTriangleCircle (double r, double a, double h) {

        double result = a * h /2 - Math.PI * Math.pow(r, 2);
        if(result > 0)
            return 1;
        else if (result < 0) {
            return -1;
        }
        else
            return 0;
    }
}
