package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task1480Test {

    //given
    int[] nums;
    int[] nums2;
    int[] nums3;
    int[] expected;
    int[] expected2;
    int[] expected3;

    Task1480 task1480;

    @Before
    public void setUp() {
        task1480 = new Task1480();
        nums = new int[] {1, 2, 3, 4};
        nums2 = new int[] {1, 1, 1, 1, 1};
        nums3 = new int[] {3, 1, 2, 10, 1};
        expected = new int[] {1, 3, 6, 10};
        expected2 = new int[] {1, 2, 3, 4, 5};
        expected3 = new int[] {3, 4, 6, 16, 17};
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
