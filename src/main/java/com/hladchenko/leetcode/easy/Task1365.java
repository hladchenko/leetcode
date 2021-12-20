/*
    Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
    That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

    Return the answer in an array.
    https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
package com.hladchenko.leetcode.easy;

public class Task1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[j] < nums[i]) {
                    result[i]++;
                }
            }
        }
        return result;
    }
}
