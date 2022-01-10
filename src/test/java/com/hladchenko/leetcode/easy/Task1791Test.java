package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task1791Test {

    @Test
    public void findCenterMethodReturnsTwo() {
        Task1791 task1791 = new Task1791();
        int[][] edges = {{1, 2}, {2, 3}, {4, 2}};

        int result = task1791.findCenter(edges);

        Assert.assertEquals(2, result);
    }

    @Test
    public void findCenterMethodReturnsOne() {
        Task1791 task1791 = new Task1791();
        int[][] edges = {{1, 2}, {5, 1}, {1, 3}, {1, 4}};

        int result = task1791.findCenter(edges);

        Assert.assertEquals(1, result);
    }
}