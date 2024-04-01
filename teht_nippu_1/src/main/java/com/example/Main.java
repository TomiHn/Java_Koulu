package com.example;

import java.util.Arrays;;

public class Main {

    public static void main(String[] args) {
        Teht1 teht1 = new Teht1();
        Teht2 teht2 = new Teht2();
        Teht3 teht3 = new Teht3();
        Teht4 teht4 = new Teht4();
        Teht5 teht5 = new Teht5();
        Teht6 teht6 = new Teht6();
        Teht7 teht7 = new Teht7();
        Teht8 teht8 = new Teht8();
        Teht9 teht9 = new Teht9();
        Teht10 teht10 = new Teht10();

        // Tehtävä 1
        System.out.println(teht1.distCalcl(0, 0, 0, 3));
        System.out.println();

        // Tehtävä 2
        teht2.treeFunc(5);
        System.out.println();

        // Tehtävä 3
        System.out.println(teht3.circleArea(4));
        System.out.println(teht3.triangleArea(3, 5));
        System.out.println(teht3.squareArea(8));
        System.out.println();

        // Tehtävä 4
        int[][] matrix = {
                { 1, 5, 7 },
                { 9, 3, 1 },
                { 0, 1, 1 }
        };
        System.out.println("Koordinaatit: " + Arrays.toString(teht4.findMax(matrix)));
        System.out.println();

        // Tehtävä 5
        int[] arr = new int[] { 8, 3, 2, 7 };
        int[] arrSort = teht5.sortAlg(arr);

        System.out.println(Arrays.toString(arrSort));
        System.out.println();

        // Tehtävä 6
        System.out.println(teht6.validPalindrome("Aivot avaavat ovia!"));
        System.out.println();

        // Tehtävä 7
        System.out.println(teht7.fibonacci(4));
        System.out.println();

        // Tehtävä 8
        System.out.println(teht8.findPrimes(10));
        System.out.println();

        // Tehtävä 9
        System.out.println(teht9.timeConver(3661));
        System.out.println();

        // Tehtävä 10
        System.out.println(teht10.randNums());

    }
}