package com.hladchenko.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Task1773Test {

    @Test
    public void whenFindColorSilverReturnOneFound() {
        // Arrange
        Task1773 task1773 = new Task1773();
        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone"));
        String ruleKey = "color", ruleValue = "silver";

        // Act
        int actual = task1773.countMatches(items, ruleKey, ruleValue);

        // Assert
        Assert.assertEquals(1, actual);
    }

    @Test
    public void whenFindPhoneByTypeReturnTwoFound() {
        // Arrange
        Task1773 task1773 = new Task1773();
        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone"));
        String ruleKey = "type", ruleValue = "phone";

        // Act
        int actual = task1773.countMatchesSecondApproach(items, ruleKey, ruleValue);

        // Assert
        Assert.assertEquals(2, actual);
    }
}
