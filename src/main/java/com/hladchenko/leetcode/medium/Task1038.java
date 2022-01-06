/*
    Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original
    BST is changed to the original key plus the sum of all keys greater than the original key in BST.

    As a reminder, a binary search tree is a tree that satisfies these constraints:

    The left subtree of a node contains only nodes with keys less than the node's key.
    The right subtree of a node contains only nodes with keys greater than the node's key.
    Both the left and right subtrees must also be binary search trees.
    https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 */
package com.hladchenko.leetcode.medium;

import com.hladchenko.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Task1038 {

    public TreeNode bstToGst(TreeNode root) {
        List<Integer> keys = new ArrayList<>();
        getAllKeys(root, keys);
        addSumToVal(root, keys);
        return root;
    }

    private void getAllKeys(TreeNode root, List<Integer> keys) {
        if (root != null) {
            keys.add(root.val);

            getAllKeys(root.left, keys);
            getAllKeys(root.right, keys);
        }
    }

    private void addSumToVal(TreeNode root, List<Integer> keys) {
        if (root != null) {

            int originalVal = root.val;
            for (int key : keys) {
                if (key > originalVal) {
                    root.val += key;
                }
            }

            addSumToVal(root.left, keys);
            addSumToVal(root.right, keys);
        }
    }
}
