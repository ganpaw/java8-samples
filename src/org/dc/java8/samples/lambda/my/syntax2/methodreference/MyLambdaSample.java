package org.dc.java8.samples.lambda.my.syntax2.methodreference;

/**
 * Here we used :: (method reference) instead of -> (lambda exp.)
 * An example of my own 'MyFunctionalInterface' which i can utilize as Lambda expression and pass it to a class 'MyClass'
 * @author q10965
 *
 */
public class MyLambdaSample {

    public static void handle(){      
      
      
    }
    
	public static void main(String[] args) {
	  
	    // Using Lamda expressions
		//MyFunctionalInterface1 functionalInterface = (String s1) -> System.out.println(s1);
		// Or 
		//MyFunctionalInterface1 functionalInterface = (s1) -> System.out.println(s1);	  
	  
		// Or using Method references
		MyFunctionalInterface functionalInterface = System.out::println;
		
		MyClass obj = new MyClass();
		obj.execute(functionalInterface);
		
	}

}
