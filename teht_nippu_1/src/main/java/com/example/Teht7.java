package com.example;

public class Teht7 {
    public int fibonacci(int n) {
        double sqrt5 = Math.sqrt(5);
        double a = (1 + sqrt5) / 2;
        double b = (1 - sqrt5) / 2;

        return (int) Math.round((Math.pow(a, n) - Math.pow(b, n)) / sqrt5);
    }

}