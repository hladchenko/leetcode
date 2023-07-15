package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task20TestTODO {

    Task20TODO task20TODO = new Task20TODO();

    @Test
    public void test_that_sring1_is_valid() {
        // given
        String s = "()";

        // when
        boolean res = task20TODO.isValid(s);

        // then
        Assert.assertTrue(res);
    }

    @Test
    public void test_that_sring2_is_valid() {
        // given
        String s = "()[]{}";

        // when
        boolean res = task20TODO.isValid(s);

        // then
        Assert.assertTrue(res);
    }

    @Test
    public void test_that_sring3_is_not_valid() {
        // given
        String s = "(]";

        // when
        boolean res = task20TODO.isValid(s);

        // then
        Assert.assertFalse(res);
    }

    @Test
    public void test_that_sring4_is_valid() {
        // given
        String s = "{[]}";

        // when
        boolean res = task20TODO.isValid(s);

        // then
        Assert.assertTrue(res);
    }

    @Test
    public void test_that_sring4_is_not_valid() {
        // given
        String s = "([)]";

        // when
        boolean res = task20TODO.isValid(s);

        // then
        Assert.assertFalse(res);
    }
}
