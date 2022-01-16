package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task1656Test {

    @Test
    public void afterInsertArrayIsFull() {
        Task1656 os = new Task1656(5);
        os.insert(3, "ccccc"); // Inserts (3, "ccccc"), returns [].
        os.insert(1, "aaaaa"); // Inserts (1, "aaaaa"), returns ["aaaaa"].
        os.insert(2, "bbbbb"); // Inserts (2, "bbbbb"), returns ["bbbbb", "ccccc"].
        os.insert(5, "eeeee"); // Inserts (5, "eeeee"), returns [].
        os.insert(4, "ddddd"); // Inserts (4, "ddddd"), returns ["ddddd", "eeeee"].

        String[] result = os.arr;

        Assert.assertArrayEquals(new String[] {"aaaaa", "bbbbb", "ccccc", "ddddd", "eeeee"}, result);
    }
}