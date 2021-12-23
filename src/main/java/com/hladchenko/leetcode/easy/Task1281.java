/*
    Given an integer number n, return the difference between the product of its digits and the sum of its digits.
    https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */
package com.hladchenko.leetcode.easy;

public class Task1281 {
    public int subtractProductAndSum(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        int product = 1;
        int sum = 0;
        for(char c : arr) {
            int num = Character.getNumericValue(c);
            product *= num;
            sum += num;
        }
        return product - sum;
    }
}
