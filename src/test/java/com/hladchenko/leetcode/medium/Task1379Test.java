package com.hladchenko.leetcode.medium;

import com.hladchenko.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class Task1379Test {

    @Test
    public void findTargetNodeInClonedTree() {
        // Arrange
        Task1379 task1379 = new Task1379();
        TreeNode original = new TreeNode(7,
                new TreeNode(4),
                new TreeNode(3, new TreeNode(6), new TreeNode(19)));
        TreeNode original2 = new TreeNode(7);
        TreeNode original3 = new TreeNode(8, null,
                new TreeNode(6, null,
                        new TreeNode(5, null, new TreeNode(4, null,
                                new TreeNode(3, null,
                                        new TreeNode(2, null,
                                                new TreeNode(1)))))));

        TreeNode target = new TreeNode(3);
        TreeNode target2 = new TreeNode(7);
        TreeNode target3 = new TreeNode(4);

        // Act
        TreeNode actual = task1379.getTargetCopy(original, original, target);
        TreeNode actual2 = task1379.getTargetCopy(original2, original2, target2);
        TreeNode actual3 = task1379.getTargetCopy(original3, original3, target3);

        // Assert
        assert actual != null;
        Assert.assertEquals(3, actual.val);
        assert actual2 != null;
        Assert.assertEquals(7, actual2.val);
        assert actual3 != null;
        Assert.assertEquals(4, actual3.val);
    }
}