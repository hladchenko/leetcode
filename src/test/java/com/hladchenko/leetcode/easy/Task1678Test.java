package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task1678Test {

    Task1678 task1678;

    public static final String command = "G()(al)";
    public static final String command2 = "G()()()()(al)";
    public static final String command3 = "(al)G(al)()()G";

    public static final String expected = "Goal";
    public static final String expected2 = "Gooooal";
    public static final String expected3 = "alGalooG";

    @Before
    public void setUp(){
        task1678 = new Task1678();
    }

    @Test
    public void get_parsed_string_with_replaced_values() {
        // Act
        String result = task1678.interpret(command);
        String result2 = task1678.interpret(command2);
        String result3 = task1678.interpret(command3);

        // Assert
        Assert.assertEquals(expected, result);
        Assert.assertEquals(expected2, result2);
        Assert.assertEquals(expected3, result3);
    }

    @Test
    public void get_parsed_string_with_replaced_values_2d_approach() {
        // Act
        String result = task1678.interpret2dApproach(command);
        String result2 = task1678.interpret2dApproach(command2);
        String result3 = task1678.interpret2dApproach(command3);

        // Assert
        Assert.assertEquals(expected, result);
        Assert.assertEquals(expected2, result2);
        Assert.assertEquals(expected3, result3);
    }


}