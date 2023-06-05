package org.example.pfizer;

import java.text.MessageFormat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestUniqueSubStringCountTest {

  @Test
  void findLongestUniqueSubstring_nullStringInput() {
    String testInput = null; // Test that null string has a count of ZERO
    System.out.println("Test case for a null input string: " + testInput);

    LongestUniqueSubStringCount lussc = new LongestUniqueSubStringCount();
    int maxCount = lussc.findLongestUniqueSubstring(testInput);
    Assertions.assertEquals(0, maxCount);
  }

  @Test
  void findLongestUniqueSubstring_BlankStringInput() {
    String testInput = "   "; // Test Blank string has maxcount of zero
    System.out.println("Test case for a blank input string is: " + testInput);

    LongestUniqueSubStringCount lussc = new LongestUniqueSubStringCount();
    int maxCount = lussc.findLongestUniqueSubstring(testInput);
    Assertions.assertEquals(0, maxCount);

  }

  @Test
  void findLongestUniqueSubstring_EmptyStringInput() {
    String testInput = ""; // Test empty string has maxcount of zero
    System.out.println("Test case for empty input string is: " + testInput);

    LongestUniqueSubStringCount lussc = new LongestUniqueSubStringCount();
    int maxCount = lussc.findLongestUniqueSubstring(testInput);
    Assertions.assertEquals(0, maxCount);
  }

  @Test
  void findLongestUniqueSubstring_nonTrivial() {
    String testInput = "geeksforgeeks"; // Test empty string has maxcount of zero
    System.out.println(
        MessageFormat.format(
            "Test case for input string is: {0}. Expected Outcome should be 7.",
            testInput));

    LongestUniqueSubStringCount lussc = new LongestUniqueSubStringCount();
    int maxCount = lussc.findLongestUniqueSubstring(testInput);
    Assertions.assertEquals(7, maxCount);
  }
}