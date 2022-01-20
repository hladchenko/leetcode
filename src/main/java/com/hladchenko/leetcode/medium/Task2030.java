/*
  In a linked list of size n, where n is even, the ith node (0-indexed) of
   the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.

  For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2.
  These are the only nodes with twins for n = 4.
  The twin sum is defined as the sum of a node and its twin.

  Given the head of a linked list with even length, return the maximum twin sum of the linked list.
  https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
 */
package com.hladchenko.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

import com.hladchenko.leetcode.common.ListNode;

public class Task2030 {

  public int pairSum(ListNode head) {
    int max = 0;
    List<Integer> list = new ArrayList<>();

    while (head != null) {
      list.add(head.val);
      head = head.next;
    }

    for (int i = 0; i < list.size() / 2; i++) {
      int sum = list.get(i) + list.get(list.size() - 1 - i);
      if (sum > max) {
        max = sum;
      }
    }

    return max;
  }
}
