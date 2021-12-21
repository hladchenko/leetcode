/*
    You are given a string s and an integer array indices of the same length.
     The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

    Return the shuffled string.
    https://leetcode.com/problems/shuffle-string/
 */
package com.hladchenko.leetcode.easy;

public class Task1528 {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = arr[i];
        }
        return String.valueOf(result);
    }
}
