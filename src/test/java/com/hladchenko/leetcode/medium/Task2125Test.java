package com.hladchenko.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class Task2125Test {

    @Test
    public void numberOfBeamsReturnsEight() {
        Task2125 task2125 = new Task2125();
        String[] bank = {"011001", "000000", "010100", "001000"};

        int result = task2125.numberOfBeams(bank);

        Assert.assertEquals(8, result);
    }

    @Test
    public void numberOfBeamsReturnsZero() {
        Task2125 task2125 = new Task2125();
        String[] bank = {"000", "111", "000"};

        int result = task2125.numberOfBeams(bank);

        Assert.assertEquals(0, result);
    }
}