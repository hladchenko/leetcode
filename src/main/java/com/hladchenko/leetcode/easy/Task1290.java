/*
  Given head which is a reference node to a singly-linked list.
   The value of each node in the linked list is either 0 or 1.
    The linked list holds the binary representation of a number.
  Return the decimal value of the number in the linked list.
  https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
package com.hladchenko.leetcode.easy;

import com.hladchenko.leetcode.common.ListNode;

public class Task1290 {

  public int getDecimalValue(ListNode head) {
    StringBuilder sb = new StringBuilder();
    readBinary(sb, head);
    return Integer.parseInt(sb.toString(), 2);
  }

  private void readBinary(StringBuilder sb, ListNode node) {
    if (node != null) {
      sb.append(node.val);
      readBinary(sb, node.next);
    }
  }
}

