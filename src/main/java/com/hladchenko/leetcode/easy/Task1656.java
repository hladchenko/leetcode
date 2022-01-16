/*
    There is a stream of n (idKey, value) pairs arriving in an arbitrary order,
     where idKey is an integer between 1 and n and value is a string. No two pairs have the same id.

    Design a stream that returns the values in increasing order of their IDs by returning a chunk (list) of
     values after each insertion. The concatenation of all the chunks should result in a list of the sorted values.

    Implement the OrderedStream class:

    OrderedStream(int n) Constructs the stream to take n values.
    String[] insert(int idKey, String value) Inserts the pair (idKey, value) into the stream, then returns the largest possible chunk of currently inserted values that appear next in the order.
    https://leetcode.com/problems/design-an-ordered-stream/
 */
package com.hladchenko.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Task1656 {

    int ptr = 0;
    String[] arr;

    public Task1656(int n) {
        arr = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        List<String> result = new ArrayList<>();
        arr[idKey - 1] = value;
        for (int i = ptr; i < arr.length; i++) {
            if (arr[i] != null) {
                result.add(arr[i]);
                ptr++;
            } else {
                break;
            }
        }
        return result;
    }
}
