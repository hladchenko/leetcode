/*
    You are given an integer array nums with no duplicates.
    A maximum binary tree can be built recursively from nums using the following algorithm:

    Create a root node whose value is the maximum value in nums.
    Recursively build the left subtree on the subarray prefix to the left of the maximum value.
    Recursively build the right subtree on the subarray suffix to the right of the maximum value.
    Return the maximum binary tree built from nums.
    https://leetcode.com/problems/maximum-binary-tree/
 */
package com.hladchenko.leetcode.medium;

import com.hladchenko.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Task654 {

    int max;
    Stack<Integer> left;
    Stack<Integer> right;

    // Not work for all the cases
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        findMaxLeftRight(nums);
        return new TreeNode(max, build(left), build(right));
    }

    private TreeNode build(Stack<Integer> nums) {
        if (!nums.empty()) {
            int num = nums.pop();
            TreeNode node = new TreeNode(num);
            if (nums.size() == 1 && nums.get(0) == 0) {
                node.left = build(nums);
            } else {
                node.right = build(nums);
            }
            return node;
        }
        return null;
    }

    private void findMaxLeftRight(int[] nums) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i < index) {
                left.add(nums[i]);
            } else if (i > index) {
                right.add(nums[i]);
            }
        }

        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> rightStack = new Stack<>();

        left.stream().sorted().forEach(leftStack::push);
        right.stream().sorted().forEach(rightStack::push);


        this.max = max;
        this.left = leftStack;
        this.right = rightStack;
    }

    // Not my solution
    public TreeNode leetcodeSolution(int[] nums) {
        return construct(nums, 0, nums.length);
    }
    public TreeNode construct(int[] nums, int l, int r) {
        if (l == r)
            return null;
        int max_i = max(nums, l, r);
        TreeNode root = new TreeNode(nums[max_i]);
        root.left = construct(nums, l, max_i);
        root.right = construct(nums, max_i + 1, r);
        return root;
    }
    public int max(int[] nums, int l, int r) {
        int max_i = l;
        for (int i = l; i < r; i++) {
            if (nums[max_i] < nums[i])
                max_i = i;
        }
        return max_i;
    }
}
