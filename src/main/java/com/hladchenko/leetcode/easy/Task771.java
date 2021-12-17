/*
    You're given strings jewels representing the types of stones that are jewels,
     and stones representing the stones you have. Each character in stones is a type of stone you have.
    You want to know how many of the stones you have are also jewels.

    Letters are case sensitive, so "a" is considered a different type of stone from "A".
    https://leetcode.com/problems/jewels-and-stones/
 */
package com.hladchenko.leetcode.easy;

public class Task771 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int jewel : jewels.toCharArray()) {
            for (int stone : stones.toCharArray()) {
                if (jewel == stone) {
                    count++;
                }
            }
        }
        return count;
    }
}
