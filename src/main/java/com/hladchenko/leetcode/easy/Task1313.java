/*
    We are given a list nums of integers representing a list compressed with run-length encoding.
    Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
    For each such pair, there are freq elements with value val concatenated in a sublist.
    Concatenate all the sublists from left to right to generate the decompressed list.
    Return the decompressed list.
    https://leetcode.com/problems/decompress-run-length-encoded-list/
 */
package com.hladchenko.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Task1313 {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
