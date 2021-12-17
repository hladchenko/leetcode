package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task771Test {
    @Test
    public void testNumJewelsInStones() {
        //given
        Task771 task771 = new Task771();

        //when
        int actual = task771.numJewelsInStones("aA", "aAAbbbb");
        int actual2 = task771.numJewelsInStones("z", "ZZ");

        //then
        Assert.assertEquals(3, actual);
        Assert.assertEquals(0, actual2);
    }
}
