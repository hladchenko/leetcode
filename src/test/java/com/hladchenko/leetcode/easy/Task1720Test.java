package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task1720Test {
    @Test
    public void decode_encoded_array() {
        // Arrange
        Task1720 task1720 = new Task1720();
        int[] encoded = {1, 2, 3};
        int[] encoded2 = {6, 2, 7, 3};
        int first = 1;
        int first2 = 4;

        // Act
        int[] result = task1720.decode(encoded, first);
        int[] result2 = task1720.decode(encoded2, first2);

        // Assert
        Assert.assertArrayEquals(new int[]{1, 0, 2, 1}, result);
        Assert.assertArrayEquals(new int[]{4, 2, 0, 7, 4}, result2);
    }
}
