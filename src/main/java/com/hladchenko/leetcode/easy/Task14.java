package com.hladchenko.leetcode.easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 *
 * @see <a href="https://leetcode.com/problems/longest-common-prefix/description/">14. Longest Common Prefix</a>
 */
public class Task14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() - 1 < i
                        || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}
