/*
    A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros.
    For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.

    Given a string n that represents a positive decimal integer,
    return the minimum number of positive deci-binary numbers needed so that they sum up to n.
    https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
 */
package com.hladchenko.leetcode.medium;

import java.math.BigInteger;

public class Task1689 {
    public int minPartitions(String n) {
        int counter = 0;
        BigInteger sum;
        BigInteger total = new BigInteger(n);

        StringBuilder initValue = new StringBuilder();
        for (char c : n.toCharArray()) {
            initValue.append((Character.getNumericValue(c) > 0 ? 1 : 0));
        }

        sum = new BigInteger(initValue.toString());
        if (!sum.equals(BigInteger.ZERO)) counter++;

        char[] nCharArr = n.toCharArray();
        char[] sumCharArr;

        while (total.compareTo(sum) > 0) {
            sumCharArr = String.valueOf(sum).toCharArray();

            StringBuilder addValue = new StringBuilder();
            for (int i = 0; i < sumCharArr.length; i++) {
                int appendNumber = Character.getNumericValue(nCharArr[i]) > Character.getNumericValue(sumCharArr[i]) ? 1 : 0;
                addValue.append(appendNumber);
            }

            sum = sum.add(new BigInteger(addValue.toString()));
            counter++;
        }
        return counter;
    }
}
