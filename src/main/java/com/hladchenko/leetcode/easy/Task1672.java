/*
    You are given an m x n integer grid accounts where accounts[i][j] is the amount of
     money the i'th customer has in the j'th bank.
    Return the wealth that the richest customer has.
    A customer's wealth is the amount of money they have in all their bank accounts.
    The richest customer is the customer that has the maximum wealth.
    https://leetcode.com/problems/richest-customer-wealth/
 */
package com.hladchenko.leetcode.easy;

import java.util.Arrays;

public class Task1672 {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
                .map(account -> Arrays.stream(account).sum())
                .max(Integer::compare)
                .orElse(0);
    }
}
