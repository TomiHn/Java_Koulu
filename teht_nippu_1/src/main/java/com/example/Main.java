package com.example;

public class Main {

    public static double distCalcl(double p1, double p2, double p3, double p4) {

        return Math.sqrt((Math.pow(p1 - p2, 2) + Math.pow(p3 - p4, 2)));
    }

    public static void main(String[] args) {

        System.out.println(distCalcl(1, 2, 3, 4));

    }
}