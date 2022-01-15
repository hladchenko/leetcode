package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task2114Test {

    @Test
    public void mostWordsFound() {
        Task2114 task2114 = new Task2114();
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        int result = task2114.mostWordsFound(sentences);

        Assert.assertEquals(6, result);
    }
}