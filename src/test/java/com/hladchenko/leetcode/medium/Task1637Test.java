package com.hladchenko.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class Task1637Test {

    @Test
    public void returnTheMaxWidthOfVerticalAriaEqualsToTwo() {
        Task1637 task1637 = new Task1637();
        int[][] points = {{8, 7}, {9, 9}, {7, 4}, {9, 7}};

        int result = task1637.maxWidthOfVerticalArea(points);

        Assert.assertEquals(1, result);
    }

    @Test
    public void returnTheMaxWidthOfVerticalAriaEqualsToThree() {
        Task1637 task1637 = new Task1637();
        int[][] points = {{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}};

        int result = task1637.maxWidthOfVerticalArea(points);

        Assert.assertEquals(3, result);
    }

    @Test
    public void returnTheMaxWidthOfVerticalAriaEqualsToTwoSecondApproach() {
        Task1637 task1637 = new Task1637();
        int[][] points = {{8, 7}, {9, 9}, {7, 4}, {9, 7}};

        int result = task1637.maxWidthOfVerticalAreaSecondApproach(points);

        Assert.assertEquals(1, result);
    }

    @Test
    public void returnTheMaxWidthOfVerticalAriaEqualsToThreeSecondApproach() {
        Task1637 task1637 = new Task1637();
        int[][] points = {{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}};

        int result = task1637.maxWidthOfVerticalAreaSecondApproach(points);

        Assert.assertEquals(3, result);
    }
}