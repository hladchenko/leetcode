package com.hladchenko.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import com.hladchenko.leetcode.common.ListNode;

public class Task2030Test {

  @Test
  public void pairSumReturnsSix() {
    Task2030 task2030 = new Task2030();
    ListNode head = new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1))));

    int result = task2030.pairSum(head);

    Assert.assertEquals(6, result);
  }

  @Test
  public void pairSumReturnsSeven() {
    Task2030 task2030 = new Task2030();
    ListNode head = new ListNode(4, new ListNode(2, new ListNode(2, new ListNode(3))));

    int result = task2030.pairSum(head);

    Assert.assertEquals(7, result);
  }

  @Test
  public void pairSumReturns10001() {
    Task2030 task2030 = new Task2030();
    ListNode head = new ListNode(10000, new ListNode(1));

    int result = task2030.pairSum(head);

    Assert.assertEquals(10001, result);
  }
}