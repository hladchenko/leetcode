package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task2006Test {

    @Test
    public void countKDifferenceAndReturnFour() {
        Task2006 task2006 = new Task2006();

        int result = task2006.countKDifference(new int[]{1, 2, 2, 1}, 1);

        Assert.assertEquals(4, result);
    }

    @Test
    public void countKDifferenceAndReturnZero() {
        Task2006 task2006 = new Task2006();

        int result = task2006.countKDifference(new int[]{1, 3}, 3);

        Assert.assertEquals(0, result);
    }

    @Test
    public void countKDifferenceAndReturnThree() {
        Task2006 task2006 = new Task2006();

        int result = task2006.countKDifference(new int[]{3, 2, 1, 5, 4}, 2);

        Assert.assertEquals(3, result);
    }
}