/*
    Given the root of a binary tree, return the sum of values of its deepest leaves.
    https://leetcode.com/problems/deepest-leaves-sum/
 */
package com.hladchenko.leetcode.medium;

public class Task1302 {
    public int deepestLeavesSum(TreeNode root) {
        throw new RuntimeException("Task is not completed!");
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}