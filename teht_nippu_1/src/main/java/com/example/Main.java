package com.example;

public class Main {

    public static double distCalcl(double p1, double p2, double p3, double p4) {

        return Math.sqrt((Math.pow(p1 - p2, 2) + Math.pow(p3 - p4, 2)));
    }

    public static void treeFunc(int height) {
        int realHeight = height * 2;
        // String whiteSpace = "";
        int space = realHeight / 2;
        for (int i = 0; i != realHeight; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(" ".repeat(space - i / 2 - 1));
            System.out.println("*".repeat(i + 1));
        }
    }

    public static int[] findMax(int[][] array) {
        int max = array[0][0];
        int[] maxValues = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxValues[0] = i;
                    maxValues[1] = j;
                } else if (array[i][j] == max) {
                    continue;
                }
            }
        }
        System.out.println("MAX = " + max);
        return maxValues;
    }

    public static int[] sortAlg(int[] arr) {
        int[] arrReturn = arr.clone();
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < arrReturn.length - 1; i++) {
            swapped = false;
            for (j = 0; j < arrReturn.length - i - 1; j++) {
                if (arrReturn[j] > arrReturn[j + 1]) {
                    temp = arrReturn[j];
                    arrReturn[j] = arrReturn[j + 1];
                    arrReturn[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
        return arrReturn;
    }

    public static void main(String[] args) {

        // T1
        // System.out.println(distCalcl(1, 2, 3, 4));

        // T2
        // treeFunc(5);

        // T3
        // CalcClass calculator = new CalcClass();
        // System.out.println("Ympyrä " + calculator.circleArea(4));
        // System.out.println("Neliö " + calculator.squareArea(4));
        // System.out.println("Kolmio " + calculator.triangleArea(4, 4));

        // T4
        // int[][] matrix = {
        // { 1, 5, 7 },
        // { 9, 3, 1 },
        // { 0, 1, 1 }
        // };
        // int[] maxMatrix = findMax(matrix);
        // System.out.println(String.format("[%d, %d]", maxMatrix[0], maxMatrix[1]));

        // T5
        int[] arrToSort = { 8, 3, 2, 7 };
        int[] newArr = sortAlg(arrToSort);
        for (int i : newArr) {
            System.out.println(i);
        }
    }
}