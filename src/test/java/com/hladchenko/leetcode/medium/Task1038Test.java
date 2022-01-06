package com.hladchenko.leetcode.medium;

import com.hladchenko.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class Task1038Test {

    @Test
    public void bstToGstTest() {
        // Assert
        Task1038 task1038 = new Task1038();
        TreeNode root = new TreeNode(4,
                new TreeNode(1, new TreeNode(0), new TreeNode(2, null, new TreeNode(3))),
                new TreeNode(6, new TreeNode(5), new TreeNode(7, null, new TreeNode(8))));
        TreeNode expected = new TreeNode(30,
                new TreeNode(36, new TreeNode(36), new TreeNode(35, null, new TreeNode(33))),
                new TreeNode(21, new TreeNode(26), new TreeNode(15, null, new TreeNode(8))));

        // Act
        TreeNode result = task1038.bstToGst(root);

        // Arrange
        Assert.assertEquals(result, expected);
    }

    @Test
    public void bstToGstTestSecondTest() {
        // Assert
        Task1038 task1038 = new Task1038();
        TreeNode root = new TreeNode(0, null, new TreeNode(1));
        TreeNode expected = new TreeNode(1, null, new TreeNode(1));

        // Act
        TreeNode result = task1038.bstToGst(root);

        // Arrange
        Assert.assertEquals(result, expected);
    }
}