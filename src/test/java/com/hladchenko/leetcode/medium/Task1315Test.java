package com.hladchenko.leetcode.medium;

import com.hladchenko.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class Task1315Test {

    @Test
    public void sumRootValueIfHasEvenGrandparent() {
        // Arrange
        Task1315 task1315 = new Task1315();
        TreeNode root = new TreeNode(6,
                new TreeNode(7,
                        new TreeNode(2, new TreeNode(9), null),
                        new TreeNode(7, new TreeNode(1), new TreeNode(4))),
                new TreeNode(8,
                        new TreeNode(1),
                        new TreeNode(3, null, new TreeNode(5))));
        TreeNode root2 = new TreeNode(1);

        // Act
        int actual = task1315.sumEvenGrandparent(root);
        int actual2 = task1315.sumEvenGrandparent(root2);

        // Assert
        Assert.assertEquals(18, actual);
        Assert.assertEquals(0, actual2);
    }
}