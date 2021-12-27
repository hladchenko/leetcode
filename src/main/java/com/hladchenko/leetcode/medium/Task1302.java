/*
    Given the root of a binary tree, return the sum of values of its deepest leaves.
    https://leetcode.com/problems/deepest-leaves-sum/
 */
package com.hladchenko.leetcode.medium;

public class Task1302 {

    int maxValue, maxDepth;

    public int deepestLeavesSum(TreeNode root) {
        maxValue = 0;
        maxDepth = 0;
        sumDeepestElements(root, 0);
        return maxValue;
    }

    private void sumDeepestElements(TreeNode root, int depth) {
        if (root.left != null) {
            sumDeepestElements(root.left, depth + 1);
        }
        if (root.right != null) {
            sumDeepestElements(root.right, depth + 1);
        }
        if (root.left == null && root.right == null) {
            if (depth > maxDepth) {
                maxValue = root.val;
                maxDepth = depth;
            } else if (depth == maxDepth) {
                maxValue += root.val;
            }
        }
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