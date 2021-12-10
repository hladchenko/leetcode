package com.hladchenko.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Task1108Test {

    @Test
    public void returnDefangedVersionOfIpAddress() {
        //given
        Task1108 task1108 = new Task1108();
        String address = "1.1.1.1";
        String address2 = "255.100.50.0";
        //when
        String actual = task1108.defangIPaddr(address);
        String actual2 = task1108.defangIPaddr(address2);
        //then
        Assert.assertEquals("1[.]1[.]1[.]1", actual);
        Assert.assertEquals("255[.]100[.]50[.]0", actual2);
    }
}
