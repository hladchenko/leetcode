/*
    There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number
     of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
    Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
     they will have the greatest number of candies among all the kids, or false otherwise.
    Note that multiple kids can have the greatest number of candies.
    https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */
package com.hladchenko.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        return Arrays.stream(candies)
                .mapToObj(kidCandies -> kidCandies + extraCandies >= Arrays.stream(candies).max().orElse(0))
                .collect(Collectors.toCollection(ArrayList<Boolean>::new));
    }
}
