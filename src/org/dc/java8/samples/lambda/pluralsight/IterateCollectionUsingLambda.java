package org.dc.java8.samples.lambda.pluralsight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://www.mkyong.com/java8/java-8-foreach-examples/
 * http://www.javaworld.com/article/2461744/java-language/java-language-iterating-over-collections-in-java-8.html
 * 
 *
 */
public class IterateCollectionUsingLambda {

  public static void main(String[] args) {

    List<String> list = Arrays.asList("Pawan", "Ranbir", "Preeti");

    list.forEach(element -> System.out.println(element));

    // or
    System.out.println("-----------------------------");

    list.forEach(System.out::println); // method references (using instance method println)


    // Map example

    Map<String, Integer> items = new HashMap<>();
    items.put("A", 10);
    items.put("B", 20);
    items.put("C", 30);
    items.put("D", 40);
    items.put("E", 50);
    items.put("F", 60);

    items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));
    
    
    items.forEach((k, v) -> {
      System.out.println("Item : " + k + " Count : " + v);
      if ("E".equals(k)) {
        System.out.println("Hello E");
      }
    });
   }
}
