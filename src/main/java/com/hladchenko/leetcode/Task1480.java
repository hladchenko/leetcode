/*
    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    Return the running sum of nums.
    https://leetcode.com/problems/running-sum-of-1d-array/
 */

package com.hladchenko.leetcode;

import java.util.Arrays;

public class Task1480 {

    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                runningSum[i] += nums[j];
            }
        }
        return runningSum;
    }

    public int[] runningSumSecondApproach(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }

    public int[] runningSumThirdApproach(int[] nums) {
        int[] result = Arrays.copyOf(nums, nums.length);
        for (int i = 1; i < result.length; i++) {
            result[i] += result[i - 1];
        }
        return result;
    }
}
