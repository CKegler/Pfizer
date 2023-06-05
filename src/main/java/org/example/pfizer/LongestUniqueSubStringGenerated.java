package org.example.pfizer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The challenge:  Given an input string of English characters,
 * find the length of the longest substring without repeating characters.
 *
 * The solution:  In linear time, this approach uses a sliding window technique
 * to identify non-repeating character substrings.  When we encounter a repeating,
 * character, we jump to a point after repeated character
 *
 * This class actually collects a list of the generated non-repeating substrings rather than just
 * tracking the maximum count.
 */
public class LongestUniqueSubStringGenerated {
  /**
   * @param input - a string of English characters
   * @return - a list of generated substrings in descending order. The maximum length substrings
   * should be first in the list
   */
  public List<String> findLongestUniqueSubstring(String input)
  {
    List<String> subStringList = new ArrayList<>();

    //Check valid input - return  if input is null, empty or blank
    if ((input == null) || input.isEmpty() || input.isBlank()) {
      return subStringList;
    }
    //Check trivial case - return one if input length is one
    if (input.length() == 1) {
      subStringList.add(input);
      return subStringList;
    }

    // Convert input String to character array and iterate over the array
    char[] inputCharArray = input.toCharArray();
    String trialString = "";
    for (char c : inputCharArray) {
      String current = String.valueOf(c);

      // If the trialString already contains the character
      // Then take substring after repeating character
      if (trialString.contains(current)) {
        trialString = trialString.substring(trialString.indexOf(current)
            + 1);
      }
      trialString += String.valueOf(c);

      subStringList.add(trialString);
    }

    // return the substrings in a list in descending order, so that the longest maximum non-repeated
    // substrings appear first in the list.
    return subStringList
        .stream()
        .sorted((str1, str2) -> str2.length() - str1.length())
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {

    String str = "loveforlove'ssake";
    System.out.println("The input string is " + str);

    LongestUniqueSubStringGenerated lussg = new LongestUniqueSubStringGenerated();

    List<String> subStringsList = lussg.findLongestUniqueSubstring(str);

    subStringsList.forEach( s -> {
          System.out.printf("the value and size of non-repeating substring is '%s', %d%n", s,
              s.length());
        }
    );

  }
}
