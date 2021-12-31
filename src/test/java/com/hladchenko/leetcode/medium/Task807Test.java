package com.hladchenko.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class Task807Test {

    @Test
    public void maxTotalSumHeightCanBeIncreased() {
        // Given
        Task807 task807 = new Task807();
        int[][] grid = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        int[][] grid2 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        // When
        int actual = task807.maxIncreaseKeepingSkyline(grid);
        int actual2 = task807.maxIncreaseKeepingSkyline(grid2);
        int actual3 = task807.maxIncreaseKeepingSkylineSecondApproach(grid);
        int actual4 = task807.maxIncreaseKeepingSkylineSecondApproach(grid2);

        // Then
        Assert.assertEquals(35, actual);
        Assert.assertEquals(0, actual2);
        Assert.assertEquals(35, actual3);
        Assert.assertEquals(0, actual4);
    }
}