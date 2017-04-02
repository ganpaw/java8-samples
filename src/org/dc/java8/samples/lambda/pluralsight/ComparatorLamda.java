package org.dc.java8.samples.lambda.pluralsight;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * Multiple arguments but single line with return.
 *
 *
 */
public class ComparatorLamda {
  public static void main(String[] args) {

    Comparator<String> comparator = new Comparator<String>() {

      @Override
      public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
      }

    };


    Comparator<String> lambdaCompatator = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
    // Or
    // Comparator<String> lambdaCompatator = (s1, s2) -> Integer.compare(s1.length(), s2.length());



    List<String> list = Arrays.asList("****", "***", "*******", "**", "*", "*****");
    Collections.sort(list, lambdaCompatator);

    for (String str : list) {
      System.out.println(str);
    }


  }
}
