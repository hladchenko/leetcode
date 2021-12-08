package com.hladchenko.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task2011Test {

    Task2011 task2011;

    @Before
    public void setUp() {
        task2011 = new Task2011();
    }

    @Test
    public void finalValueAfterOperationsTest() {
        //given
        String[] operationsArray = {"--X", "X++", "X++"};
        String[] operationsArray2 = {"++X", "++X", "X++"};
        String[] operationsArray3 = {"X++", "++X", "--X", "X--"};

        //when
        int actual = task2011.finalValueAfterOperations(operationsArray);
        int actual2 = task2011.finalValueAfterOperations(operationsArray2);
        int actual3 = task2011.finalValueAfterOperations(operationsArray3);

        //then
        Assert.assertEquals(1, actual);
        Assert.assertEquals(3, actual2);
        Assert.assertEquals(0, actual3);
    }

}
