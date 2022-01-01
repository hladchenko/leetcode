/*
    There are n people that are split into some unknown number of groups.
    Each person is labeled with a unique ID from 0 to n - 1.

    You are given an integer array groupSizes, where groupSizes[i] is the size of the group that person i is in.
    For example, if groupSizes[1] = 3, then person 1 must be in a group of size 3.

    Return a list of groups such that each person i is in a group of size groupSizes[i].

    Each person should appear in exactly one group, and every person must be in a group.
    If there are multiple answers, return any of them. It is guaranteed that there will be at least one valid solution for the given input.
    https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
 */
package com.hladchenko.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1282 {

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<List<Integer>>> categories = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            List<List<Integer>> category = categories.get(groupSizes[i]);
            if(category == null) {
                List<List<Integer>> newCategory = new ArrayList<>();
                List<Integer> list = new ArrayList<>();
                list.add(i);
                newCategory.add(list);
                categories.put(groupSizes[i], newCategory);
            } else {
                List<Integer> list = category.get(category.size() - 1);
                if (list.size() < (groupSizes[i])) {
                    list.add(i);
                } else {
                    List<Integer> newList = new ArrayList<>();
                    newList.add(i);
                    category.add(newList);
                }
            }
        }


        List<List<Integer>> result = null;
        for (List<List<Integer>> category : categories.values()) {
            if (result == null) {
                result  = category;
            } else {
                result.addAll(category);
            }
        }

        return result;
    }
}
