package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task941Test {

    @Test
    public void validMountainArray21ReturnsFalse() {
        Task941 task941 = new Task941();

        boolean result = task941.validMountainArray(new int[]{2, 1});

        Assert.assertFalse(result);
    }

    @Test
    public void validMountainArray355ReturnsFalse() {
        Task941 task941 = new Task941();

        boolean result = task941.validMountainArray(new int[]{3, 5, 5});

        Assert.assertFalse(result);
    }

    @Test
    public void validMountainArray0321ReturnsTrue() {
        Task941 task941 = new Task941();

        boolean result = task941.validMountainArray(new int[]{0, 3, 2, 1});

        Assert.assertTrue(result);
    }

    @Test
    public void validMountainArray01212ReturnsFalse() {
        Task941 task941 = new Task941();

        boolean result = task941.validMountainArray(new int[]{0, 1, 2, 1, 2});

        Assert.assertFalse(result);
    }

    @Test
    public void validMountainArray44321ReturnsFalse() {
        Task941 task941 = new Task941();

        boolean result = task941.validMountainArray(new int[]{4, 4, 3, 2, 1});

        Assert.assertFalse(result);
    }

    @Test
    public void validMountainArray67786ReturnsFalse() {
        Task941 task941 = new Task941();

        boolean result = task941.validMountainArray(new int[]{6, 7, 7, 8, 6});

        Assert.assertFalse(result);
    }
}