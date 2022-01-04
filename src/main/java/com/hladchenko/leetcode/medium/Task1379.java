/*
    Given two binary trees original and cloned and given a reference
     to a node target in the original tree.

    The cloned tree is a copy of the original tree.

    Return a reference to the same node in the cloned tree.

    Note that you are not allowed to change any of the two trees or the target
    node and the answer must be a reference to a node in the cloned tree.
    https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
 */
package com.hladchenko.leetcode.medium;

import com.hladchenko.leetcode.common.TreeNode;

public class Task1379 {

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (target.val == cloned.val) {
            return cloned;
        }
        TreeNode found;
        if (cloned.left != null) {
            found = getTargetCopy(original, cloned.left, target);
            if (found != null) {
                return found;
            }
        }
        if (cloned.right != null) {
            found = getTargetCopy(original, cloned.right, target);
            return found;
        }
        return null;
    }
}
