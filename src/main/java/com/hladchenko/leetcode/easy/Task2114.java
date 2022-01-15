/*
    A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

    You are given an array of strings sentences, where each sentences[i] represents a single sentence.

    Return the maximum number of words that appear in a single sentence.
    https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
 */
package com.hladchenko.leetcode.easy;

public class Task2114 {

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            int count = sentence.split(" ").length;
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
