package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task1342Test {
    @Test
    public void Number_of_steps_to_reduce_number_to_zero() {
        // Arrange
        Task1342 task1342 = new Task1342();
        int num = 14, num2 = 8, num3 = 123;

        // Act
        int result = task1342.numberOfSteps(num);
        int result2 = task1342.numberOfSteps(num2);
        int result3 = task1342.numberOfSteps(num3);

        // Assert
        Assert.assertEquals(6, result);
        Assert.assertEquals(4, result2);
        Assert.assertEquals(12, result3);
    }
}