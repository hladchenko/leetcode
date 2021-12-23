package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task1281Test {
    @Test
    public void return_subtract_product_and_sum() {
        // Arrange
        Task1281 task1281 = new Task1281();

        // Act
        int result = task1281.subtractProductAndSum(234);
        int result2 = task1281.subtractProductAndSum(4421);

        // Assert
        Assert.assertEquals(15, result);
        Assert.assertEquals(21, result2);
    }
}
