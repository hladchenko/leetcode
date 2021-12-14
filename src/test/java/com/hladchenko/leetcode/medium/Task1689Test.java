package com.hladchenko.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class Task1689Test {
    @Test
    public void testMinPartitions() {
        //given
        Task1689 task1689 = new Task1689();
        String n1 = "32";
        String n2 = "82734";
        String n3 = "27346209830709182346";

        //when
        int actual1 = task1689.minPartitions(n1);
        int actual2 = task1689.minPartitions(n2);
        int actual3 = task1689.minPartitions(n3);

        //then
        Assert.assertEquals(3, actual1);
        Assert.assertEquals(8, actual2);
        Assert.assertEquals(9, actual3);
    }
}
