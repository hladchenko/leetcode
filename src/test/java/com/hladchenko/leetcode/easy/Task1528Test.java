package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task1528Test {
    @Test
    public void restore_string_from_string_and_int_array() {
        // Arrange
        Task1528 task1528 = new Task1528();
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String s2 = "abc";
        int[] indices2 = {0, 1, 2};

        // Act
        String actual = task1528.restoreString(s, indices);
        String actual2 = task1528.restoreString(s2, indices2);

        // Assert
        Assert.assertEquals("leetcode", actual);
        Assert.assertEquals("abc", actual2);
    }
}
