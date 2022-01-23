package com.hladchenko.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class Task11Test {

    @Test
    public void maxAreaReturns49() {
        Task11 task11 = new Task11();

        int result = task11.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});

        Assert.assertEquals(49, result);
    }

    @Test
    public void maxAreaReturns1() {
        Task11 task11 = new Task11();

        int result = task11.maxArea(new int[]{1, 1});

        Assert.assertEquals(1, result);
    }
}