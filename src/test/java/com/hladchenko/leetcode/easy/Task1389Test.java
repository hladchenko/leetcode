package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task1389Test {

    @Test
    public void Create_ordered_array() {
        // Arrange
        Task1389 task1389 = new Task1389();
        int[] nums = {0, 1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 4, 0};
        int[] nums3 = {1};
        int[] index = {0, 1, 2, 2, 1};
        int[] index2 = {0, 1, 2, 3, 0};
        int[] index3 = {0};

        // Act
        int[] result = task1389.createTargetArray(nums, index);
        int[] result2 = task1389.createTargetArray(nums2, index2);
        int[] result3 = task1389.createTargetArray(nums3, index3);

        // Assert
        Assert.assertArrayEquals(new int[]{0, 4, 1, 3, 2}, result);
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4}, result2);
        Assert.assertArrayEquals(new int[]{1}, result3);
    }
}