package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task1512Test {

    @Test
    public void testNumIdenticalPairs() {
        //given
        Task1512 task1512 = new Task1512();
        int[] nums = {1, 2, 3, 1, 1, 3};
        int[] nums2 = {1, 1, 1, 1};
        int[] nums3 = {1, 2, 3};

        //when
        int actual = task1512.numIdenticalPairs(nums);
        int actual2 = task1512.numIdenticalPairs(nums2);
        int actual3 = task1512.numIdenticalPairs(nums3);

        //then
        Assert.assertEquals(4, actual);
        Assert.assertEquals(6, actual2);
        Assert.assertEquals(0, actual3);
    }
}
