/*
    Given the root of a binary tree, return the sum of values of nodes with an even-valued grandparent.
     If there are no nodes with an even-valued grandparent, return 0.

    A grandparent of a node is the parent of its parent if it exists.
    https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
 */
package com.hladchenko.leetcode.medium;

public class Task1315 {

    public int sumEvenGrandparent(TreeNode root) {
        int sum = 0;
        if (root.left != null) {
            if (root.left.left != null) {
                if (root.val % 2 == 0) {
                    sum += root.left.left.val;
                }
            }
            if (root.left.right != null) {
                if (root.val % 2 == 0) {
                    sum += root.left.right.val;
                }
            }
            sum += sumEvenGrandparent(root.left);
        }

        if (root.right != null) {
            if (root.right.left != null) {
                if (root.val % 2 == 0) {
                    sum += root.right.left.val;
                }
            }
            if (root.right.right != null) {
                if (root.val % 2 == 0) {
                    sum += root.right.right.val;
                }
            }
            sum += sumEvenGrandparent(root.right);
        }
        return sum;
    }
}
