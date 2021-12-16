/*
    Given an array of integers nums, return the number of good pairs.
    A pair (i, j) is called good if nums[i] == nums[j] and i < j.
    https://leetcode.com/problems/number-of-good-pairs/
 */
package com.hladchenko.leetcode.easy;

public class Task1512 {
    public int numIdenticalPairs(int[] nums) {
        int goodPairsCount = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) goodPairsCount++;
            }
        }
        return goodPairsCount;
    }
}
