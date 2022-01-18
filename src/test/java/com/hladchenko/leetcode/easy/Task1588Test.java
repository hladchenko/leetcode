package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task1588Test {

    @Test
    public void sumOddLengthSubarrays() {
        Task1588 task1588 = new Task1588();
        int[] arr = {1, 4, 2, 5, 3};
        int[] arr2 = {1, 2};
        int[] arr3 = {10, 11, 12};

        int result = task1588.sumOddLengthSubarrays(arr);
        int result2 = task1588.sumOddLengthSubarrays(arr2);
        int result3 = task1588.sumOddLengthSubarrays(arr3);

        Assert.assertEquals(58, result);
        Assert.assertEquals(3, result2);
        Assert.assertEquals(66, result3);
    }
}