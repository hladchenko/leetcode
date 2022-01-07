/*
    You are given an integer n and an integer start.

    Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.

    Return the bitwise XOR of all elements of nums.
    https://leetcode.com/problems/xor-operation-in-an-array/
 */
package com.hladchenko.leetcode.easy;

public class Task1486 {

    public int xorOperation(int n, int start) {
        int xor = start;
        for (int i = 1; i < n; i++) {
            xor ^= start + 2 * i;
        }
        return xor;
    }
}
