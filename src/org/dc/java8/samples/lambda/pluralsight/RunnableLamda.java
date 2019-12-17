package org.dc.java8.samples.lambda.pluralsight;


/**
 * No argument but multiple lines in run method
 * 
 *
 */
public class RunnableLamda {

  public static void runLoop(){
    for (int i = 0; i < 3; i++) {
      System.out.println("Hello World from Runnable Lamda " + Thread.currentThread().getName());
    }  
  }
  
  public static void main(String[] args) throws InterruptedException {
    Runnable runnableLambda = RunnableLamda::runLoop;
    
    // In case of single statement
    //Runnable runnableLambda = () -> System.out.println("Hello World from Runnable Lamda " + Thread.currentThread().getName());

    Thread t1 = new Thread(runnableLambda);
    Thread t2 = new Thread(runnableLambda);

    t1.start();
    t1.join();
    t2.start();
  }

}
