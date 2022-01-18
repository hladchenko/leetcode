/*
    Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.

    A subarray is a contiguous subsequence of the array.

    Return the sum of all odd-length subarrays of arr.
    https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 */
package com.hladchenko.leetcode.easy;

public class Task1588 {

    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 1; i <= arr.length; i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < arr.length; j++) {
                    if (i + j <= arr.length) {
                        for (int y = 0; y < i; y++) {
                            sum += arr[j + y];
                        }
                    }
                }
            }
        }
        return sum;
    }
}
