package com.hladchenko.leetcode.easy;

public class Task2574 {
    public int[] leftRightDifference(int[] nums) {

        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int[] leftSum = new int[nums.length];
            int[] rightSum = new int[nums.length];

            for (int j = 0; j < nums.length; j++) {
                if (j < i) {
                    leftSum[i] += nums[j];
                } else if (j > i) {
                    rightSum[i] += nums[j];
                }
            }

            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;
    }
}
