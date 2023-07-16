package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task88Test {

    Task88 task88 = new Task88();

    @Test
    public void merge() {
        // given
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};

        int m = 3, n = 3;

        // when
        task88.merge(nums1, m, nums2, n);

        // then
        Assert.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }
}