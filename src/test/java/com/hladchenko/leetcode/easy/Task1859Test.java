package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Task1859Test {

    @Test
    public void sortSentenceByWordIndex() {
        // Arrange
        Task1859 task1859 = new Task1859();

        // Act
        String result = task1859.sortSentence("is2 sentence4 This1 a3");
        String result2 = task1859.sortSentence("Myself2 Me1 I4 and3");

        // Assert
        Assert.assertEquals("This is a sentence", result);
        Assert.assertEquals("Me Myself and I", result2);
    }
}