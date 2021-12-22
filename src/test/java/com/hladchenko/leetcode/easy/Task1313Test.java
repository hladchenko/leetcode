package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task1313Test {
    @Test
    public void decompress_list() {
        // Arrange
        Task1313 task1313 = new Task1313();
        int[] nums = {1, 2, 3, 4};
        int[] nums2 = {1, 1, 2, 3};

        // Act
        int[] result = task1313.decompressRLElist(nums);
        int[] result2 = task1313.decompressRLElist(nums2);

        //Assert
        Assert.assertArrayEquals(new int[]{2, 4, 4, 4}, result);
        Assert.assertArrayEquals(new int[]{1, 3, 3}, result2);
    }
}
