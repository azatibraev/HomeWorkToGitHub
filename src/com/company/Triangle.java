package com.company;

public class Triangle {
    double a;
    double b;
    double c;

    public void area() {
        double perimeter = ((a + b + c) / 2);
        double area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        System.out.println(" Area of triangle is = " + area);
    }
}