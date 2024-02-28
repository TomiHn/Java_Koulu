package com.example;

public class CalcClass {
    public double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double squareArea(double sideLength) {
        return Math.pow(sideLength, 2);
    }

    public double triangleArea(double b, double height) {
        return (height * b) / 2;
    }
}
