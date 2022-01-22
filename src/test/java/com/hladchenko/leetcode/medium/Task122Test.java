package com.hladchenko.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class Task122Test {

    @Test
    public void maxProfitEqualsSeven() {
        Task122 task122 = new Task122();

        int result = task122.maxProfit(new int[]{7, 1, 5, 3, 6, 4});

        Assert.assertEquals(7, result);
    }

    @Test
    public void maxProfitEqualsFour() {
        Task122 task122 = new Task122();

        int result = task122.maxProfit(new int[]{1, 2, 3, 4, 5});

        Assert.assertEquals(4, result);
    }

    @Test
    public void maxProfitEqualsZero() {
        Task122 task122 = new Task122();

        int result = task122.maxProfit(new int[]{7, 6, 4, 3, 1});

        Assert.assertEquals(0, result);
    }
}