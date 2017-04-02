package org.dc.java8.samples.lambda.pluralsight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumers {

	public static void main(String[] args) {
		List<String> source = Arrays.asList("one","two","three", "four","five");
		
		List<String> result = new ArrayList<String>();
		
		Consumer<String> c1 = s -> System.out.println(s);
		
		// Using method reference
		//Consumer<String> c1 = System.out::println;
		

		Consumer<String> c2 = s -> result.add(s);
		// 
		//Consumer<String> c2 =  result::add;
		
		// It means run c1 and then provide output of c1 into c2 and build 'result'
		source.forEach(c1.andThen(c2));

		//list.forEach(c1);

		System.out.println(result.size());
	}

}
