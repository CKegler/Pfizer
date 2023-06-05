package org.example.pfizer;

import static org.junit.jupiter.api.Assertions.*;

import java.text.MessageFormat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestUniqueSubStringGeneratedTest {

  @Test
  void findLongestUniqueSubstring_nullStringInput() {
    String testInput = null; // Test that null string has a count of ZERO
    System.out.println("Test case for a null input string: " + testInput);

    LongestUniqueSubStringGenerated lussg = new LongestUniqueSubStringGenerated();
    int maxCount = lussg.findLongestUniqueSubstring(testInput).size();
    Assertions.assertEquals(0, maxCount);
  }

  @Test
  void findLongestUniqueSubstring_BlankStringInput() {
    String testInput = "   "; // Test Blank string has maxcount of zero
    System.out.println("Test case for a blank input string is: " + testInput);

    LongestUniqueSubStringGenerated lussg = new LongestUniqueSubStringGenerated();
    int maxCount = lussg.findLongestUniqueSubstring(testInput).size();
    Assertions.assertEquals(0, maxCount);
  }

  @Test
  void findLongestUniqueSubstring_EmptyStringInput() {
    String testInput = ""; // Test empty string has maxcount of zero
    System.out.println("Test case for empty input string is: " + testInput);

    LongestUniqueSubStringGenerated lussg = new LongestUniqueSubStringGenerated();
    int maxCount = lussg.findLongestUniqueSubstring(testInput).size();
    Assertions.assertEquals(0, maxCount);
  }

  @Test
  void findLongestUniqueSubstring_nonTrivialInput() {
    String testInput = "geeksforgeeks"; // Test empty string has maxcount of zero
    System.out.println(
        MessageFormat.format(
            "Test case for input string is: {0}. Expected Outcome should be 7.",
            testInput));

    LongestUniqueSubStringGenerated lussg = new LongestUniqueSubStringGenerated();
    String longestSubString = lussg.findLongestUniqueSubstring(testInput).get(0);
    Assertions.assertEquals(7, longestSubString.length());
    Assertions.assertEquals("eksforg", longestSubString );
  }
}