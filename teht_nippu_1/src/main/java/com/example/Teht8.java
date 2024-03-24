package com.example;

import java.lang.Math;
import java.util.ArrayList;

public class Teht8 {
    public ArrayList<Integer> findPrimes(int n) {

        ArrayList<Integer> primes = new ArrayList<>();
        int middle = (int) Math.ceil(n / 2.0);

        for (int i = middle; i <= n; i++) {
            boolean isPrime = true;

            if (i <= 1) {
                isPrime = false;
            } else {
                int limit = (int) Math.sqrt(i);

                for (int j = 2; j <= limit; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }

}
