package com.example;

/**
 * Teht6
 */
public class Teht6 {
    public boolean validPalindrome(String s) {

        StringBuilder word = new StringBuilder(s.replaceAll("[' ',.?!]", "").toLowerCase().toString());

        return word.toString().equals(word.reverse().toString());
    }

}