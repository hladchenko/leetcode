/*
    Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

    Given a balanced string s, split it in the maximum amount of balanced strings.

    Return the maximum amount of split balanced strings.
    https://leetcode.com/problems/split-a-string-in-balanced-strings/
 */
package com.hladchenko.leetcode.easy;

public class Task1221 {

    public int balancedStringSplit(String s) {
        int count = 0, left = 0, right = 0;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == 'L') {
                left++;
            } else {
                right++;
            }
            if (right == left && right != 0) {
                count++;
                left = 0;
                right = 0;
            }
        }
        return count;
    }
}
