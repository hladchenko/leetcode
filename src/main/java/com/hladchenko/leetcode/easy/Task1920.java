/*
    Build Array from Permutation
    https://leetcode.com/problems/build-array-from-permutation/
 */
package com.hladchenko.leetcode.easy;

import java.util.Arrays;

public class Task1920 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int[] arr2 = {5,0,1,2,3,4};

        System.out.println(Arrays.toString(buildArray(arr)));
        System.out.println(Arrays.toString(buildArray(arr2)));
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}