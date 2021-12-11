package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task1929Test {

    public static final int[] arr = {0, 2, 1, 5, 3, 4};
    public static final int[] arr2 = {5, 0, 1, 2, 3, 4};
    public static final int[] expected = {0, 2, 1, 5, 3, 4, 0, 2, 1, 5, 3, 4};
    public static final int[] expected2 = {5, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4};

    Task1929 task1929;

    @Before
    public void setUp() {
        task1929 = new Task1929();
    }

    @Test
    public void testGetConcatenation() {
        Assert.assertArrayEquals(task1929.getConcatenation(arr), expected);
        Assert.assertArrayEquals(task1929.getConcatenation(arr2), expected2);
    }

    @Test
    public void testGetConcatenationSecondApproach() {
        Assert.assertArrayEquals(task1929.getConcatenationSecondApproach(arr), expected);
        Assert.assertArrayEquals(task1929.getConcatenationSecondApproach(arr2), expected2);
    }
}
