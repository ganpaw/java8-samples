package org.dc.java8.samples.lambda.my.syntax1;

/**
 * An example of my own 'MyFunctionalInterface' which i can utilize as Lambda expression and pass it
 * to a class 'MyClass'
 * 
 *
 */
public class MyLambdaSample {

  public static void main(String[] args) {
    // MyFunctionalInterface functionalInterface = (String s1, String s2) -> System.out.println(s1
    // +":"+ s2);
    // Or
    MyFunctionalInterface functionalInterface = (s1, s2) -> System.out.println(s1 + ":" + s2);

    MyClass obj = new MyClass();
    obj.execute(functionalInterface);


    MyFunctionalInterface1 funcIn = System.out::println;
    
    obj.execute(funcIn);
    obj.execute(System.out::println);
  }

}
