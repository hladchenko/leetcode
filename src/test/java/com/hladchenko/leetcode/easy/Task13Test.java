package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task13Test {

    Task13 task13 = new Task13();

    @Test
    public void when_roman_III_then_int_is_3() {
        //given
        String roman = "III";

        //when
        int result = task13.romanToInt(roman);

        //then
        Assert.assertEquals(3, result);
    }

    @Test
    public void when_roman_XXVII_then_int_is_27() {
        //given
        String roman = "XXVII";

        //when
        int result = task13.romanToInt(roman);

        //then
        Assert.assertEquals(27, result);
    }

    @Test
    public void when_roman_IV_then_int_is_4() {
        //given
        String roman = "IV";

        //when
        int result = task13.romanToInt(roman);

        //then
        Assert.assertEquals(4, result);
    }
}
