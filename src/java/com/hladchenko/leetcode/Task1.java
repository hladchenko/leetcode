/*
    Given an array of integers nums and an integer target,
     return indices of the two numbers such that they add up to target.
    https://leetcode.com/problems/two-sum/
 */
package com.hladchenko.leetcode;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] nums2 = {3,2,4};
        int target2 = 6;
        int[] nums3 = {3, 3};
        int target3 = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
        System.out.println(Arrays.toString(twoSum(nums3, target3)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
