package com.hladchenko.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class Task1769Test {
    @Test
    public void Move_balls_for_minimum_number_of_operations() {
        // Arrange
        Task1769 task1769 = new Task1769();
        String boxes = "110";
        String boxes2 = "001011";

        // Act
        int[] result = task1769.minOperations(boxes);
        int[] result2 = task1769.minOperations(boxes2);

        // Assert
        Assert.assertArrayEquals(new int[]{1, 1, 3}, result);
        Assert.assertArrayEquals(new int[]{11, 8, 5, 4, 3, 4}, result2);
    }

}