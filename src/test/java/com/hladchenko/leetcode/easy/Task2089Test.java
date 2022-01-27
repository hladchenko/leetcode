package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Task2089Test {

    @Test
    public void targetIndices() {
        Task2089 task2089 = new Task2089();

        List result = task2089.targetIndices(new int[]{1, 2, 5, 2, 3}, 2);

        Assert.assertEquals(List.of(1, 2), result);
    }
}