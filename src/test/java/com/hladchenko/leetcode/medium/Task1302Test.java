package com.hladchenko.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class Task1302Test {

    @Test
    public void Tree_node_deepest_leaves_sum() {
        // Arrange
        Task1302 task1302 = new Task1302();
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4, new TreeNode(7), null),
                new TreeNode(5)), new TreeNode(3, null,
                new TreeNode(6, null, new TreeNode(8))));

        TreeNode root2 = new TreeNode(6,
                new TreeNode(7,
                        new TreeNode(2, new TreeNode(9), null),
                        new TreeNode(7, new TreeNode(1), new TreeNode(4))),
                new TreeNode(8,
                        new TreeNode(1),
                        new TreeNode(3, null, new TreeNode(5))));

        // Act
        int result = task1302.deepestLeavesSum(root);
        int result2 = task1302.deepestLeavesSum(root2);

        // Assert
        Assert.assertEquals(15, result);
        Assert.assertEquals(19, result2);
    }

}