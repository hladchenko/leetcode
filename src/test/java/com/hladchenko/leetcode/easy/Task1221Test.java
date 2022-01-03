package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task1221Test {

    @Test
    public void countBalancedPartsInString() {
        // Arrange
        Task1221 task1221 = new Task1221();

        // Act
        int actual = task1221.balancedStringSplit("RLRRLLRLRL");
        int actual2 = task1221.balancedStringSplit("RLLLLRRRLR");
        int actual3 = task1221.balancedStringSplit("LLLLRRRR");
        int actual4 = task1221.balancedStringSplit("RLRRRLLRLL");

        // Assert
        Assert.assertEquals(4, actual);
        Assert.assertEquals(3, actual2);
        Assert.assertEquals(1, actual3);
        Assert.assertEquals(2, actual4);
    }
}