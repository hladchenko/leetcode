package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task1365Test {

    @Test
    public void testSmallerNumberThanCurrent() {
        // Arrange
        Task1365 task1365 = new Task1365();
        int[] nums = {8, 1, 2, 2, 3};
        int[] nums2 = {6, 5, 4, 8};
        int[] nums3 = {7, 7, 7, 7};

        // Act
        int[] actual = task1365.smallerNumbersThanCurrent(nums);
        int[] actual2 = task1365.smallerNumbersThanCurrent(nums2);
        int[] actual3 = task1365.smallerNumbersThanCurrent(nums3);

        // Assert
        Assert.assertArrayEquals(new int[]{4, 0, 1, 1, 3}, actual);
        Assert.assertArrayEquals(new int[]{2, 1, 0, 3}, actual2);
        Assert.assertArrayEquals(new int[]{0, 0, 0, 0}, actual3);
    }
}
