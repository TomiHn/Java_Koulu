package com.example;

public class Teht4 {
    public int[] findMax(int[][] array) {
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
}
