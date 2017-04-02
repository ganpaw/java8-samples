package org.dc.java8.samples.lambda.pluralsight;

import java.io.File;
import java.io.FileFilter;


/**
 * Just one argument and one line for accept method
 * 
 *
 */
public class FirstLambda {
  public static void main(String[] args) {

    FileFilter fileFilter = new FileFilter() {

      @Override
      public boolean accept(File file) {
        return file.getName().endsWith(".txt");
      }
    };


    FileFilter lambdaFileFilter = (File file) -> file.getName().endsWith(".txt");

    File dir = new File("C:/BuildReleaseDeployment");

    File[] list = dir.listFiles(lambdaFileFilter);

    for (File txtFile : list) {
      System.out.println(txtFile.getAbsolutePath());
    }

  }
}
