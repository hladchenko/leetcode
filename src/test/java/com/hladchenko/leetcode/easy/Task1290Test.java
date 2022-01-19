package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

import com.hladchenko.leetcode.common.ListNode;

public class Task1290Test {

  @Test
  public void getDecimalValueReturnsFive() {
    Task1290 task1290 = new Task1290();
    ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));

    int result = task1290.getDecimalValue(head);

    Assert.assertEquals(5, result);
  }

  @Test
  public void getDecimalValueReturnsZero() {
    Task1290 task1290 = new Task1290();
    ListNode head = new ListNode(0);

    int result = task1290.getDecimalValue(head);

    Assert.assertEquals(0, result);
  }
}