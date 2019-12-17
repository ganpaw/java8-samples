package org.dc.java8.samples.lambda.my.syntax1;

public class MyClass {
	
	public void execute(MyFunctionalInterface myFunctionalInterface){
		
		myFunctionalInterface.doIt("Hello", "My Lambda Function");
	}
	
	   public void execute(MyFunctionalInterface1 myFunctionalInterface){
	        
	        myFunctionalInterface.doIt("Single Parameter");
	    }
}
