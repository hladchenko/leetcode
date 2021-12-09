package com.hladchenko.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task1480Test {

    //given
    public static final int[] nums = {1, 2, 3, 4};
    public static final int[] nums2 = {1, 1, 1, 1, 1};
    public static final int[] nums3 = {3, 1, 2, 10, 1};
    public static final int[] expected = {1, 3, 6, 10};
    public static final int[] expected2 = {1, 2, 3, 4, 5};
    public static final int[] expected3 = {3, 4, 6, 16, 17};

    Task1480 task1480;

    @Before
    public void setUp() {
        task1480 = new Task1480();
    }

    @Test
    public void testRunningSum() {
        //when
        int[] actual = task1480.runningSum(nums);
        int[] actual2 = task1480.runningSum(nums2);
        int[] actual3 = task1480.runningSum(nums3);

        //then
        Assert.assertArrayEquals(expected ,actual);
        Assert.assertArrayEquals(expected2 ,actual2);
        Assert.assertArrayEquals(expected3 ,actual3);
    }

    @Test
    public void testRunningSumSecondApproach() {
        //when
        int[] actual = task1480.runningSumSecondApproach(nums);
        int[] actual2 = task1480.runningSumSecondApproach(nums2);
        int[] actual3 = task1480.runningSumSecondApproach(nums3);

        //then
        Assert.assertArrayEquals(expected ,actual);
        Assert.assertArrayEquals(expected2 ,actual2);
        Assert.assertArrayEquals(expected3 ,actual3);
    }

    @Test
    public void testRunningSumThirdApproach() {
        //when
        int[] actual = task1480.runningSumThirdApproach(nums);
        int[] actual2 = task1480.runningSumThirdApproach(nums2);
        int[] actual3 = task1480.runningSumThirdApproach(nums3);

        //then
        Assert.assertArrayEquals(expected ,actual);
        Assert.assertArrayEquals(expected2 ,actual2);
        Assert.assertArrayEquals(expected3 ,actual3);
    }
}
