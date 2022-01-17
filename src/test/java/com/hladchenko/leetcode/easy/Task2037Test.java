package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task2037Test {

  @Test
  public void minMovesToSeat() {
    Task2037 task2037 = new Task2037();

    int result = task2037.minMovesToSeat(new int[]{3, 1, 5}, new int[]{2, 7, 4});
    int result2 = task2037.minMovesToSeat(new int[]{4, 1, 5, 9}, new int[]{1, 3, 2, 6});
    int result3 = task2037.minMovesToSeat(new int[]{2, 2, 6, 6}, new int[]{1, 3, 2, 6});

    Assert.assertEquals(4, result);
    Assert.assertEquals(7, result2);
    Assert.assertEquals(4, result3);
  }
}