package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task9Test {

    @Test
    public void testIsPalindrome() {
        //given
        Task9 task9 = new Task9();

        //when
        boolean actual1 = task9.isPalindrome(121);
        boolean actual2 = task9.isPalindrome(-121);
        boolean actual3 = task9.isPalindrome(10);
        boolean actual4 = task9.isPalindrome(-101);

        //then
        Assert.assertTrue(actual1);
        Assert.assertFalse(actual2);
        Assert.assertFalse(actual3);
        Assert.assertFalse(actual4);
    }
}
