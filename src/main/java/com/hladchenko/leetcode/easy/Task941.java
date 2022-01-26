package com.hladchenko.leetcode.easy;

/**
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * @see <a href="https://leetcode.com/problems/valid-mountain-array/">941. Valid Mountain Array</a>
 */
public class Task941 {

    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3 || arr[0] >= arr[1]) {
            return false;
        }
        boolean decrease = false;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) return false;
            boolean decreasing = arr[i - 1] > arr[i];
            if (decreasing && !decrease) { decrease = true; }
            else if (!decreasing && decrease) return false;
        }
        return decrease;
    }
}
