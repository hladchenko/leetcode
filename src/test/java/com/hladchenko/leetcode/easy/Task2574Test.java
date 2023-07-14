package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task2574Test {

    Task2574 task2574 = new Task2574();

    @Test
    public void leftRightDifference() {
        // given
        int[] arr = new int[]{10,4,8,3};

        // when
        int[] res = task2574.leftRightDifference(arr);

        // then
        Assert.assertArrayEquals(new int[]{15,1,11,22}, res);
    }
}