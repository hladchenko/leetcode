package com.hladchenko.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2160 {

    //TODO: debug and find a problem
    public int minimumSum(int num) {
        String[] numArr = String.valueOf(num).split("");
        List<String> numList = new ArrayList<>();
        for (int i = 0; i < numArr.length - 1; i++) {
            numList.add(numArr[i] + numArr[i + 1]);
            for (int j = 0; j < numArr.length; j++) {
                for (int k = 0; k < numArr.length; k++) {
                    if (j == i || j == (i + 1)) continue;
                    numList.add(numArr[j] + numArr[k]);
                }
            }
        }
        numList = numList.stream().distinct().sorted().collect(Collectors.toList());
        return Integer.parseInt(numList.get(0)) + Integer.parseInt(numList.get(1));
    }
}
