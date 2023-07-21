package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task27Test {

    Task27 task27 = new Task27();

    @Test
    public void removeElement() {
        // given
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;

        // when

        int res = task27.removeElement(nums, val);

        // then
        Assert.assertArrayEquals(new int[]{2, 2, 0, 0}, nums);
        Assert.assertEquals(2, res);
    }
}