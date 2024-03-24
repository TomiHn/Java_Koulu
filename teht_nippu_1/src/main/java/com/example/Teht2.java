package com.example;

public class Teht2 {
    public void treeFunc(int height) {
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
}
