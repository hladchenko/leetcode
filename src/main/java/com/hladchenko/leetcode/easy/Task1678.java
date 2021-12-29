/*
    You own a Goal Parser that can interpret a string command.
    The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
    The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
    The interpreted strings are then concatenated in the original order.

    Given the string command, return the Goal Parser's interpretation of command.
    https://leetcode.com/problems/goal-parser-interpretation/
 */
package com.hladchenko.leetcode.easy;

public class Task1678 {

    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = command.toCharArray();
        for (int i = 0; i < charArr.length;) {
            if (i + 3 < charArr.length) {
                if (charArr[i] == '('
                        && charArr[i + 1] == 'a'
                        && charArr[i + 2] == 'l'
                        && charArr[i + 3] == ')') {
                    sb.append("al");
                    i += 4;
                    continue;
                }
            }
            if (i + 1 < charArr.length) {
                if (charArr[i] == '(' && charArr[i + 1] == ')') {
                    sb.append("o");
                    i += 2;
                    continue;
                }
            }
            sb.append(charArr[i]);
            i++;
        }
        return sb.toString();
    }

    public String interpret2dApproach(String command) {
        return command.replaceAll("\\(al\\)", "al").replaceAll("\\(\\)", "o");
    }
}
