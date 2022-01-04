/*
    Given the root node of a binary search tree and two integers low and high,
     return the sum of values of all nodes with a value in the inclusive range [low, high].
     https://leetcode.com/problems/range-sum-of-bst/
 */
package com.hladchenko.leetcode.easy;

import com.hladchenko.leetcode.common.TreeNode;

public class Task938 {

    public int rangeSumBST(TreeNode root, int low, int high) {

        if (root == null) {
            return 0;
        }

        int sum = 0;

       sum += rangeSumBST(root.left, low, high);
       sum += rangeSumBST(root.right, low, high);

        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }

        return sum;
    }
}
