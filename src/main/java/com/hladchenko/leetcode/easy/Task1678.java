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
        command = command.replaceAll("\\(al\\)", "al");
        command = command.replaceAll("\\(\\)", "o");
        return command;
    }
}
