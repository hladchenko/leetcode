/*
    A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
    Each word consists of lowercase and uppercase English letters.

    A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

    For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
    Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
    https://leetcode.com/problems/sorting-the-sentence/
 */
package com.hladchenko.leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Task1859 {

    public String sortSentence(String s) {
        return Arrays.stream(s.split(" "))
                .sorted(Comparator.comparingInt(s2 -> s2.charAt(s2.length() - 1)))
                .map(str -> str.substring(0, str.length() - 1))
                .collect(Collectors.joining(" "));
    }
}
