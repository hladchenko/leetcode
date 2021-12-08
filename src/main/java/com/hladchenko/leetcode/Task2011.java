/*
    There is a programming language with only four operations and one variable X:

    ++X and X++ increments the value of the variable X by 1.
    --X and X-- decrements the value of the variable X by 1.
    Initially, the value of X is 0.

    Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
    https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
 */

package com.hladchenko.leetcode;

public class Task2011 {

    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.contains("++")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}
