package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Teht10 {
    public HashMap<String, ArrayList<Integer>> randNums() {

        HashMap<String, ArrayList<Integer>> nums = new HashMap<>();

        nums.put("negative", new ArrayList<>());
        nums.put("positive", new ArrayList<>());
        nums.put("zero", new ArrayList<>());

        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            int num = rand.nextInt(101) - 50;
            if (num < 0) {
                nums.get("negative").add(num);
            } else if (num > 0) {
                nums.get("positive").add(num);
            } else {
                nums.get("zero").add(num);
            }
        }

        return nums;
    }
}
