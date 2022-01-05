/*
    You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

    The ith item is said to match the rule if one of the following is true:

    ruleKey == "type" and ruleValue == typei.
    ruleKey == "color" and ruleValue == colori.
    ruleKey == "name" and ruleValue == namei.

    Return the number of items that match the given rule.
    https://leetcode.com/problems/count-items-matching-a-rule/
 */
package com.hladchenko.leetcode.easy;

import java.util.List;

public class Task1773 {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleIndex = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;
        return (int)items.stream().filter(item -> item.get(ruleIndex).equals(ruleValue)).count();
    }

    public int countMatchesSecondApproach(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int ruleIndex = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;
        for (List<String> item : items) {
            if (item.get(ruleIndex).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
