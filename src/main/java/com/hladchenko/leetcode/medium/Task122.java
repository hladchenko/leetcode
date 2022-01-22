package com.hladchenko.leetcode.medium;

/**
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
 * Find and return the maximum profit you can achieve.
 *
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/">122. Best Time to Buy and Sell Stock II</a>
 */
public class Task122 {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int last = prices[0];
        for (int price : prices) {
            if (last < price) {
                profit += price - last;
            }

            last = price;
        }
        return profit;
    }
}
