package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task2160TODOTest {

    Task2160TODO task2160 = new Task2160TODO();

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