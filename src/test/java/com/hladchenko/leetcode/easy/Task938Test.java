package com.hladchenko.leetcode.easy;

import com.hladchenko.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class Task938Test {

    @Test
    public void sumOfTreeNodesInRange() {
        // Arrange
        Task938 task938 = new Task938();

        TreeNode root = new TreeNode(10,
                new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                new TreeNode(15, null, new TreeNode(18)));

        TreeNode root2 = new TreeNode(10,
                new TreeNode(5,
                        new TreeNode(3, new TreeNode(1), null),
                        new TreeNode(7, new TreeNode(6), null)),
                new TreeNode(15, new TreeNode(13), new TreeNode(18)));

        // Act
        int result = task938.rangeSumBST(root, 7, 15);
        int result2 = task938.rangeSumBST(root2, 6, 10);

        // Assert
        Assert.assertEquals(32, result);
        Assert.assertEquals(23, result2);
    }
}