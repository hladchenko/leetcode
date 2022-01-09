/*
    Given n points on a 2D plane where points[i] = [xi, yi],
    Return the widest vertical area between two points such that no points are inside the area.

    A vertical area is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height).
     The widest vertical area is the one with the maximum width.

    Note that points on the edge of a vertical area are not considered included in the area.
    https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
 */
package com.hladchenko.leetcode.medium;

import java.util.Arrays;

public class Task1637 {

    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xPoints = Arrays.stream(points)
                .mapToInt(i -> i[0])
                .distinct()
                .sorted()
                .toArray();

        int max = 0;
        for (int i = 1; i < xPoints.length; i++){
            int difference = xPoints[i] - xPoints[i - 1];
            if (difference > max) {
                max = difference;
            }
        }
        return max;
    }
}
