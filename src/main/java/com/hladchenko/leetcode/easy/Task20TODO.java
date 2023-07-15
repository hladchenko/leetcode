package com.hladchenko.leetcode.easy;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">20. Valid Parentheses</a>
 */
public class Task20TODO {
    public boolean isValid(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (c == '{') {
                sum++;
            } else if (c == '}') {
                sum--;
            } else if (c == '[') {
                sum += 2;
            } else if (c == ']') {
                sum -= 2;
            } else if(c == '(') {
                sum += 3;
            } else {
                sum -= 3;
            }
        }
        return sum == 0;
    }
}
