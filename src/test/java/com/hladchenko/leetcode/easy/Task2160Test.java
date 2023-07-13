package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task2160Test {

    Task2160 task2160 = new Task2160();

    @Test
    public void minimumSum() {
        // given
        int num = 2932;

        // when
        int minSum = task2160.minimumSum(num);

        // then
        Assert.assertEquals(52, minSum);
    }
}