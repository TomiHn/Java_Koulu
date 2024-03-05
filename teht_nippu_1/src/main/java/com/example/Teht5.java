package com.example;

/**
 * Teht5
 */
public class Teht5 {
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
}