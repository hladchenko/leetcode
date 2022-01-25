package com.hladchenko.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Task1291 {

    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        for (int i = low; i < high; i++) {
            char[] arr = String.valueOf(i).toCharArray();
            boolean isSequential = true;
            int previous = Integer.valueOf(arr[0]);
            for (int j = 1; j < arr.length; j++) {
                if (previous + 1 != Integer.valueOf(arr[j])) {
                    isSequential = false;
                }
                previous = Integer.valueOf(arr[j]);
            }
            if (isSequential) {
                list.add(i);
            }
        }
        return list;
    }

    public List<Integer> sequentialDigitsSecondApproach(int low, int high) {
        List<Integer> list = new ArrayList<>();
        // TODO
        return list;
    }
}
