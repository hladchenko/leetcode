package com.hladchenko.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class Task1828Test {
    @Test
    public void testCountPoints() {
        //given
        Task1828 task1828 = new Task1828();
        int[][] points = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries = {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};

        int[][] points2 = {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}};
        int[][] queries2 = {{1, 2, 2}, {2, 2, 2}, {4, 3, 2}, {4, 3, 3}};

        //when
        int[] actual = task1828.countPoints(points, queries);
        int[] actual2 = task1828.countPoints(points2, queries2);

        //then
        Assert.assertArrayEquals(new int[]{3, 2, 2}, actual);
        Assert.assertArrayEquals(new int[]{2, 3, 2, 4}, actual2);
    }
}
