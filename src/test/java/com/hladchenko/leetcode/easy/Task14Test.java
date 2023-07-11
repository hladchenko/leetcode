package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task14Test {

    Task14 task14 = new Task14();

    @Test
    public void is_the_same_prefix_fl() {
        // given
        String[] strs = new String[]{"flower", "flow", "flight"};

        // when
        String same = task14.longestCommonPrefix(strs);

        // then
        Assert.assertEquals("fl", same);
    }

    @Test
    public void no_same_prefix() {
        // given
        String[] strs = new String[]{"dog", "racecar", "car"};

        // when
        String same = task14.longestCommonPrefix(strs);

        // then
        Assert.assertEquals("", same);
    }
}
