package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task1486Test {

    @Test
    public void xorAllElementsAndReturn() {
        // Arrange
        Task1486 task1486 = new Task1486();

        // Act
        int result = task1486.xorOperation(5, 0);
        int result2 = task1486.xorOperation(4, 3);

        // Assert
        Assert.assertEquals(8, result);
        Assert.assertEquals(8, result2);
    }
}