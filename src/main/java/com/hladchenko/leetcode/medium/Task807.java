/*
    There is a city composed of n x n blocks, where each block contains a single building
     shaped like a vertical square prism. You are given a 0-indexed n x n integer matrix
     grid where grid[r][c] represents the height of the building located in the block at row r and column c.

    A city's skyline is the the outer contour formed by all the building when viewing the side
     of the city from a distance. The skyline from each cardinal direction north, east, south, and west may be different.

    We are allowed to increase the height of any number of buildings by any amount
    (the amount can be different per building). The height of a 0-height building can also be increased.
     However, increasing the height of a building should not affect the city's skyline from any cardinal direction.

    Return the maximum total sum that the height of the buildings can be increased by without changing the city's skyline
     from any cardinal direction.
     https://leetcode.com/problems/max-increase-to-keep-city-skyline/
 */
package com.hladchenko.leetcode.medium;

public class Task807 {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum += findMax(i, j, grid) - grid[i][j];
            }
        }
        return sum;
    }

    private int findMax(int i, int j, int[][] grid) {
        int maxInLine = grid[i][j], maxInColumn = grid[i][j];
        for (int y = 0; y < grid[i].length; y++) {
            if (grid[i][y] > maxInLine) {
                maxInLine = grid[i][y];
            }
        }
        for (int z = 0; z < grid.length; z++) {
            if (grid[z][j] > maxInColumn) {
                maxInColumn = grid[z][j];
            }
        }
        return maxInLine < maxInColumn ? maxInLine : maxInColumn;
    }

    // Not my solution
    public int maxIncreaseKeepingSkylineSecondApproach(int[][] grid) {
        int N = grid.length;
        int[] rowMaxes = new int[N];
        int[] colMaxes = new int[N];

        for (int r = 0; r < N; ++r)
            for (int c = 0; c < N; ++c) {
                rowMaxes[r] = Math.max(rowMaxes[r], grid[r][c]);
                colMaxes[c] = Math.max(colMaxes[c], grid[r][c]);
            }

        int ans = 0;
        for (int r = 0; r < N; ++r)
            for (int c = 0; c < N; ++c)
                ans += Math.min(rowMaxes[r], colMaxes[c]) - grid[r][c];

        return ans;
    }
}
