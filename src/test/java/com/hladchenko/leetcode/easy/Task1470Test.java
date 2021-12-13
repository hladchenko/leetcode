package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task1470Test {

    @Test
    public void testShuffle() {
        //given
        Task1470 task1470 = new Task1470();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] nums2 = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] nums3 = {1, 1, 2, 2};
        int[] nums4 = {1, 1, 7, 9, 3, 5, 2, 1, 1, 7, 9, 3, 5, 2,};
        //when
        int[] actual = task1470.shuffle(nums, 3);
        int[] actual2 = task1470.shuffle(nums2, 4);
        int[] actual3 = task1470.shuffle(nums3, 2);
        int[] actual4 = task1470.shuffle(nums4, 7);
        //then
        Assert.assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, actual);
        Assert.assertArrayEquals(new int[]{1, 4, 2, 3, 3, 2, 4, 1}, actual2);
        Assert.assertArrayEquals(new int[]{1, 2, 1, 2}, actual3);
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 7, 7, 9, 9, 3, 3, 5, 5, 2, 2}, actual4);
    }
}
