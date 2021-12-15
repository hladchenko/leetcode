package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Task1431Test {
    @Test
    public void whenRunKidsWithCandies_returnBooleanListWithIsGreatestNumberOfCandies() {
        //given
        Task1431 task1431 = new Task1431();
        int[] candies = {2, 3, 5, 1, 3};
        int[] candies2 = {4, 2, 1, 1, 2};
        int[] candies3 = {12, 1, 12};
        int extraCandies = 3;
        int extraCandies2 = 1;
        int extraCandies3 = 10;

        //when
        List<Boolean> actual = task1431.kidsWithCandies(candies, extraCandies);
        List<Boolean> actual2 = task1431.kidsWithCandies(candies2, extraCandies2);
        List<Boolean> actual3 = task1431.kidsWithCandies(candies3, extraCandies3);

        //then
        Assert.assertEquals(List.of(true, true, true, false, true), actual);
        Assert.assertEquals(List.of(true, false, false, false, false), actual2);
        Assert.assertEquals(List.of(true, false, true), actual3);
    }
}
