package com.hladchenko.leetcode.medium;

import com.hladchenko.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class Task654Test {

    @Test
    public void constructMaximumBinaryTree() {
        Task654 task654 = new Task654();
        int[] nums = {3, 2, 1, 6, 0, 5};
        TreeNode expected = new TreeNode(6,
                new TreeNode(3, null, new TreeNode(2, null, new TreeNode(1))),
                new TreeNode(5, new TreeNode(0), null));

        TreeNode result = task654.constructMaximumBinaryTree(nums);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void constructMaximumBinaryTreeSecondTest() {
        Task654 task654 = new Task654();
        int[] nums = {3, 2, 1};
        TreeNode expected = new TreeNode(3, null, new TreeNode(2, null, new TreeNode(1)));

        TreeNode result = task654.constructMaximumBinaryTree(nums);

        Assert.assertEquals(expected, result);
    }
}