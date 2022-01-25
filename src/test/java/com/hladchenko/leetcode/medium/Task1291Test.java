package com.hladchenko.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Task1291Test {

    @Test
    public void sequentialDigits() {
        Task1291 task1291 = new Task1291();

        List<Integer> result = task1291.sequentialDigits(100, 300);

        Assert.assertEquals(result, List.of(123, 234));
    }

    @Test
    public void sequentialDigitsSecond() {
        Task1291 task1291 = new Task1291();

        List<Integer> result = task1291.sequentialDigits(1000, 13000);

        Assert.assertEquals(result, List.of(1234, 2345, 3456, 4567, 5678, 6789, 12345));
    }

    @Test
    public void sequentialDigitsSecondApproach() {
        Task1291 task1291 = new Task1291();

        List<Integer> result = task1291.sequentialDigitsSecondApproach(100, 300);

        Assert.assertEquals(result, List.of(123, 234));
    }

    @Test
    public void sequentialDigitsSecondSecondApproach() {
        Task1291 task1291 = new Task1291();

        List<Integer> result = task1291.sequentialDigitsSecondApproach(1000, 13000);

        Assert.assertEquals(result, List.of(1234, 2345, 3456, 4567, 5678, 6789, 12345));
    }
}