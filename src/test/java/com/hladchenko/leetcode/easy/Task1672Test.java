package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task1672Test {

    @Test
    public void testMaximumWealth() {
        //given
        Task1672 task1672 = new Task1672();
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        int[][] accounts2 = {{1, 5}, {7, 3}, {3, 5}};
        int[][] accounts3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};

        //when
        int maxWealth = task1672.maximumWealth(accounts);
        int maxWealth2 = task1672.maximumWealth(accounts2);
        int maxWealth3 = task1672.maximumWealth(accounts3);

        //then
        Assert.assertEquals(6, maxWealth);
        Assert.assertEquals(10, maxWealth2);
        Assert.assertEquals(17, maxWealth3);
    }

}
