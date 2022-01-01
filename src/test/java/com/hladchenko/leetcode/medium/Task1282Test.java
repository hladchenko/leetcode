package com.hladchenko.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Task1282Test {

    @Test
    public void groupThePeople() {
        // Arrange
        Task1282 task1282 = new Task1282();
        int[] groupSizes = {3, 3, 3, 3, 3, 1, 3};
        int[] groupSizes2 = {2, 1, 3, 3, 3, 2};

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(5));
        expected.add(List.of(0, 1, 2));
        expected.add(List.of(3, 4, 6));

        List<List<Integer>> expected2 = new ArrayList<>();
        expected2.add(List.of(1));
        expected2.add(List.of(0, 5));
        expected2.add(List.of(2, 3, 4));

        // Act
        List<List<Integer>> actual = task1282.groupThePeople(groupSizes);
        List<List<Integer>> actual2 = task1282.groupThePeople(groupSizes2);

        // Assert
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }

}