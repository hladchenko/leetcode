package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task1614Test {

    @Test
    public void maxDepthEqualsThree() {
        Task1614 task1614 = new Task1614();
        String s =  "(1+(2*3)+((8)/4))+1";
        String s2 =  "(1)+((2))+(((3)))";

        int result  = task1614.maxDepth(s);
        int result2  = task1614.maxDepth(s2);

        Assert.assertEquals(3, result);
        Assert.assertEquals(3, result2);
    }
}