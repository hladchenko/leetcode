package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task1688Test {

  @Test
  public void numberOfMatchesReturnsSix() {
    Task1688 task1688 = new Task1688();

    int result = task1688.numberOfMatches(7);

    Assert.assertEquals(6, result);
  }

  @Test
  public void numberOfMatchesReturnsThirteen() {
    Task1688 task1688 = new Task1688();

    int result = task1688.numberOfMatches(14);

    Assert.assertEquals(13, result);
  }
}