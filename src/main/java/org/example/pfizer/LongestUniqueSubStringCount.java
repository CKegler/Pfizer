package org.example.pfizer;

/**
 * The challenge:  Given an input string of English characters,
 * find the length of the longest substring without repeating characters.
 *
 * The solution:  In linear time, this approach uses a sliding window technique
 * to identify non-repeating character substrings.  When we encounter a repeating,
 * character, we jump to a point after repeated character
 */
public class LongestUniqueSubStringCount {

  /**
   *
   * @param input - a string of English characters
   * @return - length of maximum substring with non-repeating characters
   */
  public int findLongestUniqueSubstring(String input)
  {
    String trialString = "";
    // Result
    int maxLength = -1;

    //Check valid input - return  if input is null, empty or blank
    if ((input == null) || input.isEmpty() || input.isBlank()) {
      return 0;
    }
    //Check trivial case - return one if input length is one
    if (input.length() == 1) {
      return 1;
    }

    // Convert input String to character array and iterate over the array
    char[] inputCharArray = input.toCharArray();
    for (char c : inputCharArray) {
      String current = String.valueOf(c);

      // If the trialString already contains the character
      // Then take substring after repeating character
      if (trialString.contains(current)) {
        trialString = trialString.substring(trialString.indexOf(current)
            + 1);
      }
      trialString += String.valueOf(c);
      System.out.printf("\tthe value and size of non-repeating substring is '%s', %d%n",
          trialString, trialString.length());
      maxLength = Math.max(trialString.length(), maxLength);
    }

    return maxLength;
  }

  public static void main(String[] args) {

    String str = "loveforlove'ssake";
    System.out.println("The input string is " + str);

    LongestUniqueSubStringCount lussc = new LongestUniqueSubStringCount();

    int len = lussc.findLongestUniqueSubstring(str);
    System.out.println("The length of the longest " +
        "non-repeating character substring is " + len);
  }
}